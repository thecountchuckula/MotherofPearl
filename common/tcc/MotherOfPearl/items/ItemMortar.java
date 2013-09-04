package tcc.MotherOfPearl.items;

import tcc.MotherOfPearl.ModMain;
import darkevilmac.MotherOfPearl.utils.AutoTextureItem;

public class ItemMortar extends AutoTextureItem {

    public ItemMortar(int par1) {
        super(par1);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(64);
        this.setCreativeTab(ModMain.tabMoP);
        this.setUnlocalizedName("mortar");
    }

}
