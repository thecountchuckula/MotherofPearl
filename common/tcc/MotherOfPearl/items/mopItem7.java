package tcc.MotherOfPearl.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem7 extends ItemSword {

    public mopItem7(int par1) {
        super(par1, ModInfo.pearlKnife);
        maxStackSize = 1;
        this.setCreativeTab(ModMain.tabMoP);
        this.setUnlocalizedName("knifePearl");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return ModInfo.pearl.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
