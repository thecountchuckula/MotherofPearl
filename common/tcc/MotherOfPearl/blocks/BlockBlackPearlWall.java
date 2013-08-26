package tcc.MotherOfPearl.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import tcc.MotherOfPearl.ModMain;
import darkevilmac.MotherOfPearl.lib.Reference;

public class BlockBlackPearlWall extends BlockWall
{

	

public BlockBlackPearlWall(int par1, Block par2Block) {
		super(par1, par2Block);
		// TODO Auto-generated constructor stub
        this.setUnlocalizedName("blackPearlstoneWall");
        this.setHardness(1.0F);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(ModMain.tabMoP);
	}


@Override
public Icon getIcon(int par1, int par2)
{
	 return ModBlocks.blackPearlstone.getIcon(par1, par2);
}
@Override
public void registerIcons(IconRegister par1IconRegister)
{
	 this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
}
/**
 * Returns the ID of the items to drop on destruction.
 */
@Override
public int idDropped(int par1, Random par2Random, int par3) {
    return ModBlocks.blackPearlWall.blockID;
}
/**
 * Returns the quantity of items to drop on block destruction.
 */
@Override
public int quantityDropped(Random par1Random) {
    return 1;
}
}