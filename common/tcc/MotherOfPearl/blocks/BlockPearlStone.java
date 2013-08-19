package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tcc.MotherOfPearl.ModMain;
import darkevilmac.MotherOfPearl.lib.Reference;

public class BlockPearlStone extends Block {

    public BlockPearlStone(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
        this.setUnlocalizedName("pearlstone");
        this.setHardness(1.0F);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(ModMain.tabMoP);
    }

    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

}