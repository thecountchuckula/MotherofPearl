package tcc.MotherOfPearl.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem3 extends Item {
    public static final String[] bowPullIconNameArray = new String[] { "mop:bowPearl_pulling_0", "mop:bowPearl_pulling_1", "mop:bowPearl_pulling_2" };
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public mopItem3(int par1) {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(384);
        this.setCreativeTab(ModMain.tabMoP);
    }

    private int itemId = this.itemID;

    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled()) {
            return;
        }
        j = event.charge;

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(itemId)) {
            float f = (float) j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double) f < 0.1D) {
                return;
            }

            if (f > 1.0F) {
                f = 1.0F;
            }

            EntityArrow entityArrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

            if (f == 1.0F) {
                entityArrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (k > 0) {
                entityArrow.setDamage(entityArrow.getDamage() + (double) k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (l > 0) {
                entityArrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0) {
                entityArrow.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag) {
                entityArrow.canBePickedUp = 2;
            } else {
                par3EntityPlayer.inventory.consumeInventoryItem(itemId);
            }

            if (!par2World.isRemote) {
                par2World.spawnEntityInWorld(entityArrow);
            }
        }
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        return par1ItemStack;
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.bow;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled()) {
            return event.result;
        }

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(itemId)) {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    public int getItemEnchantability() {
        return 1;
    }

    Icon[] icons;

    public String getBowName(String unlocalizedName) {
        return unlocalizedName.split("\\.")[0];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("mop:" + "bowPearl" + "_standby");
        for (int i = 0; i < 3; i++) {
            this.iconArray[i] = iconRegister.registerIcon("mop:" + "bowPearl_pulling_" + i);
        }
    }

    public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
        if (player.getItemInUse() == null)
            return this.itemIcon;
        int var4 = stack.getMaxItemUseDuration() - useRemaining;
        if (var4 >= 18) {
            return iconArray[3];
        } else if (var4 > 13) {
            return iconArray[2];
        } else if (var4 > 0) {
            return iconArray[1];
        }
        return iconArray[0];
    }
}