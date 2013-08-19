package tcc.MotherOfPearl.items;

import tcc.MotherOfPearl.ModMain;
import darkevilmac.MotherOfPearl.utils.AutoTextureItem;

public class ItemShell extends AutoTextureItem {

    public ItemShell(int par1) {
        super(par1);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(64);
        this.setCreativeTab(ModMain.tabMoP);
        this.setUnlocalizedName("shell");
    }

}
