package tcc.MotherOfPearl;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenClay;
import cpw.mods.fml.common.IWorldGenerator;

public class blockWorldgen implements IWorldGenerator
	{
	/** The block ID for clay. */
    private int clayOysterBlockId;

    /** The number of blocks to generate. */
    private int numberOfBlocks;

    public void WorldGenClayOyster(int par1)
    {
        this.clayOysterBlockId = ModInfo.clayOyster.blockID;
        this.numberOfBlocks = par1;
    }


	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        if (par1World.getBlockMaterial(par3, par4, par5) != Material.water)
        {
            return false;
        }
        else
        {
            int l = par2Random.nextInt(this.numberOfBlocks - 2) + 2;
            byte b0 = 1;

            for (int i1 = par3 - l; i1 <= par3 + l; ++i1)
            {
                for (int j1 = par5 - l; j1 <= par5 + l; ++j1)
                {
                    int k1 = i1 - par3;
                    int l1 = j1 - par5;

                    if (k1 * k1 + l1 * l1 <= l * l)
                    {
                        for (int i2 = par4 - b0; i2 <= par4 + b0; ++i2)
                        {
                            int j2 = par1World.getBlockId(i1, i2, j1);

                            if (j2 == Block.dirt.blockID || j2 == ModInfo.clayOyster.blockID)
                            {
                                par1World.setBlock(i1, i2, j1, this.clayOysterBlockId, 0, 2);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }


	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}

}
