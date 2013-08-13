package tcc.MotherOfPearl.items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem13 extends ItemTool {

	
	public mopItem13(int par1) {
		super(par1, 0F, ModInfo.pearlShovel, ItemSpade.blocksEffectiveAgainst);
		this.maxStackSize = 1;
		this.setCreativeTab(ModMain.tabMoP);
		this.setUnlocalizedName("shovelPearl");
	}
	

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
