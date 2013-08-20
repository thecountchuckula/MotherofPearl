package darkevilmac.MotherOfPearl.Config;

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

    public static int shovelPearlID;
    public static int swordPearlID;
    public static int bootsPearlID;
    public static int braShellID;
    public static int chestplatePearlID;
    public static int helmetPearlID;
    public static int leggingsPearlID;
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

    public static void init() {
        ModMain.cfg.load();
        // Items
        blackPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Black Pearl", 5100).getInt();
        bootsPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Boots", 5101).getInt();
        bowPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Bow", 5102).getInt();
        braShellID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Shell Bra", 5103).getInt();
        chestplatePearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Chestplate", 5104).getInt();
        helmetPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Helmet", 5105).getInt();
        knifePearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearling Knife", 5106).getInt();
        leggingsPearlID = ModMain.cfg.get(Configuration.CATEGORY_ITEM, "Pearl Leggings", 5107).getInt();
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
        // Blocks
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
