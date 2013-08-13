package tcc.MotherOfPearl.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class mopItem14 extends Item {
	
	private final EnumToolMaterial toolMaterial;

	public mopItem14(int par1) {
		super(par1);
		this.toolMaterial = tcc.MotherOfPearl.ModInfo.pearlSword;
		this.maxStackSize = 1;
        this.setMaxDamage(64);
		this.setCreativeTab(ModMain.tabMoP);
		this.setUnlocalizedName("swordPearl");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
