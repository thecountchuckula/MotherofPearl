package tcc.MotherOfPearl.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem11 extends Item {

	public mopItem11(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		this.setMaxStackSize(16);
		this.setCreativeTab(ModMain.tabMoP);
		this.setUnlocalizedName("pearl");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
