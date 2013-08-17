package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tcc.MotherOfPearl.ModInfo;
import tcc.MotherOfPearl.ModMain;

public class mopBlock4 extends Block {

    public mopBlock4(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
        this.setUnlocalizedName("blackPearlstoneBrick");
        this.setHardness(1.0F);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(ModMain.tabMoP);
    }

    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(ModInfo.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

}