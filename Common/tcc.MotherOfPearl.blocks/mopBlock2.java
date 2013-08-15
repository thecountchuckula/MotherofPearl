package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;

public class mopBlock2 extends Block {

	public mopBlock2(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName("blackPearlstone");
		this.setHardness(1.0F);
		this.setStepSound(soundStoneFootstep);
		this.setCreativeTab(ModMain.tabMoP);
	}

	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
	}
	
}