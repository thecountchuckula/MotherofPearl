package darkevilmac.MotherOfPearl.Config;

import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import tcc.MotherOfPearl.ModMain;

public class MOPConfiguration {

    public static int blackPearlID;
    public static int bowPearlID;
    public static int knifePearlID;
    public static int oysterID;
    public static int oysterMeatID;
    public static int pearlID;
    public static int shellID;
    public static int blackPearlDiamondID;
    public static int pearlDiamondID;

    public static int shovelPearlID;
    public static int swordPearlID;
    public static int bootsPearlID;
    public static int braShellID;
    public static int chestplatePearlID;
    public static int helmetPearlID;
    public static int leggingsPearlID;
    public static int pearlCobblestoneFenceID;
    public static int pearlstoneBrickFenceID;
    public static int pearlstoneFenceID;
    public static int blackPearlCobblestoneFenceID;
    public static int blackPearlstoneBrickFenceID;
    public static int blackPearlstoneFenceID;
    public static int pearlstoneID;
    public static int blackPearlstoneID;
    public static int pearlstoneBrickID;
    public static int pearlCobblestoneID;
    public static int blackPearlCobblestoneID;
    public static int blackPearlstoneBrickID;
    public static int clayOysterID;
    public static int classicClayID;
    public static int bootsBlackPearlID;
    public static int chestplateBlackPearlID;
    public static int helmetBlackPearlID;
    public static int leggingsBlackPearlID;
    public static int skirtGrassID;
    public static int shovelBlackPearlID;
    public static int swordBlackPearlID;
    public static int crownShellID;
    public static int hempSandalsID;
    public static int bootsBlackPearlDiamondID;
    public static int chestplateBlackPearlDiamondID;
    public static int helmetBlackPearlDiamondID;
    public static int leggingsBlackPearlDiamondID;
    public static int bootsPearlDiamondID;
    public static int chestplatePearlDiamondID;
    public static int helmetPearlDiamondID;
    public static int leggingsPearlDiamondID;

    public static void init() {
        ModMain.cfg.load();
        // Items
        blackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearl", 5100).getInt();
        bootsPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Boots", 5101).getInt();
        bowPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Bow", 5102).getInt();
        braShellID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Shell Bra", 5103).getInt();
        chestplatePearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Chestplate", 5104).getInt();
        helmetPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Helmet", 5105).getInt();
        knifePearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearling Knife", 5106).getInt();
        leggingsPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Leggings", 5107).getInt();
        oysterID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Oyster", 5108).getInt();
        oysterMeatID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Oyster Meat", 5109).getInt();
        pearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl", 5110).getInt();
        shellID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Shell", 5111).getInt();
        shovelPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Shovel", 5112).getInt();
        swordPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Sword", 5113).getInt();
        bootsBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Boots", 5114).getInt();
        chestplateBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Chestplate", 5115).getInt();
        helmetBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Helmet", 5116).getInt();
        leggingsBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Leggings", 5117).getInt();
        skirtGrassID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Grass Skirt", 5118).getInt();
        shovelBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearl Shovel", 5119).getInt();
        swordBlackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearl Sword", 5120).getInt();
        crownShellID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Crown of Shells", 5121).getInt();
        hempSandalsID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Hemp Sandals", 5122).getInt();
        // Diamond
        blackPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Diamond", 5123).getInt();
        pearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Diamond", 5124).getInt();
        bootsPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Diamond Boots", 5125).getInt();
        chestplatePearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Diamond Chestplate", 5126).getInt();
        helmetPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Diamond Helmet", 5127).getInt();
        leggingsPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearly Diamond Leggings", 5128).getInt();
        bootsBlackPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Diamond Boots", 5129).getInt();
        chestplateBlackPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Diamond Chestplate", 5130).getInt();
        helmetBlackPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Diamond Helmet", 5131).getInt();
        leggingsBlackPearlDiamondID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearly Diamond Leggings", 5132).getInt();
        
        // Blocks

        pearlstoneFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Stone Fence", 518).getInt();
        pearlCobblestoneFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Cobblestone Fence", 519).getInt();
        pearlstoneBrickFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Stone Brick Fence", 520).getInt();
        blackPearlCobblestoneFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone Fence", 522).getInt();
        blackPearlstoneBrickFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Cobblestone Fence", 523).getInt();
        blackPearlstoneFenceID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone Brick Fence", 524).getInt();
        pearlCobblestoneID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Cobblestone", 516).getInt();
        pearlstoneID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Stone", 510).getInt();
        blackPearlCobblestoneID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Cobblestone", 517).getInt();
        blackPearlstoneID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone", 511).getInt();
        pearlstoneBrickID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Pearly Stone Brick", 512).getInt();
        blackPearlstoneBrickID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone Brick", 513).getInt();
        clayOysterID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Oyster Yielding Clay", 514).getInt();
        classicClayID = ModMain.cfg.get(Configuration.CATEGORY_BLOCK, "Classic Clay", 515).getInt();

        ModMain.cfg.save();
    }
}
