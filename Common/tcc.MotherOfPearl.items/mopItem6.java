package tcc.MotherOfPearl.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem6 extends ItemArmor {
	


	public mopItem6(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4, String type) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		// TODO Auto-generated constructor stub
		this.setMaxStackSize(1);
		this.setCreativeTab(ModMain.tabMoP);
		this.setUnlocalizedName("helmetPearl");
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));

	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return ModInfo.MOD_ID.toLowerCase() + ":" + "pearl_1.png";
	}
	@Override
	  public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	  return ModInfo.pearl.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}