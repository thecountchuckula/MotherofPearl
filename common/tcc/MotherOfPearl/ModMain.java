package tcc.MotherOfPearl;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import tcc.MotherOfPearl.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.NAME, version = ModInfo.version)
@NetworkMod(channels = { ModInfo.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class ModMain {

    public static CreativeTabs tabMoP = new CreativeTabs("MoP") {
        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(ModInfo.pearl, 1, 0);
        }
    };
    public static CreativeTabs tabMoP_WIP = new CreativeTabs("MoP_WIP") {
        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(ModInfo.braShell, 1, 0);
        }
    };

    static int blackPearlID;
    static int bowPearlID;
    static int knifePearlID;
    static int oysterID;
    static int oysterMeatID;
    static int pearlID;
    static int shellID;

    static int shovelPearlID;
    static int swordPearlID;
    static int bootsPearlID;
    static int braShellID;
    static int chestplatePearlID;
    static int helmetPearlID;
    static int leggingsPearlID;
    static int pearlstoneID;
    static int blackPearlstoneID;
    static int pearlstoneBrickID;
    static int blackPearlstoneBrickID;
    static int clayOysterID;
    static int bootsBlackPearlID;
    static int chestplateBlackPearlID;
    static int helmetBlackPearlID;
    static int leggingsBlackPearlID;
    static int skirtGrassID;
    static int shovelBlackPearlID;
    static int swordBlackPearlID;
    static int crownShellID;
    static int hempSandalsID;

    @SidedProxy(clientSide = ModInfo.PROXY_PATH + ".ClientProxy", serverSide = ModInfo.PROXY_PATH + ".CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        // Items
        blackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearl", 5100).getInt();
        bootsPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Boots", 5101).getInt();
        bowPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Bow", 5102).getInt();
        braShellID = config.get(Configuration.CATEGORY_ITEM, "Shell Bra", 5103).getInt();
        chestplatePearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Chestplate", 5104).getInt();
        helmetPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Helmet", 5105).getInt();
        knifePearlID = config.get(Configuration.CATEGORY_ITEM, "Pearling Knife", 5106).getInt();
        leggingsPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Leggings", 5107).getInt();
        oysterID = config.get(Configuration.CATEGORY_ITEM, "Oyster", 5108).getInt();
        oysterMeatID = config.get(Configuration.CATEGORY_ITEM, "Oyster Meat", 5109).getInt();
        pearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl", 5110).getInt();
        shellID = config.get(Configuration.CATEGORY_ITEM, "Shell", 5111).getInt();
        shovelPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Shovel", 5112).getInt();
        swordPearlID = config.get(Configuration.CATEGORY_ITEM, "Pearl Sword", 5113).getInt();
        bootsBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearly Boots", 5114).getInt();
        chestplateBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearly Chestplate", 5115).getInt();
        helmetBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearly Helmet", 5116).getInt();
        leggingsBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearly Leggings", 5117).getInt();
        skirtGrassID = config.get(Configuration.CATEGORY_ITEM, "Grass Skirt", 5118).getInt();
        shovelBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearl Shovel", 5119).getInt();
        swordBlackPearlID = config.get(Configuration.CATEGORY_ITEM, "Black Pearl Sword", 5120).getInt();
        crownShellID = config.get(Configuration.CATEGORY_ITEM, "Crown of Shells", 5121).getInt();
        hempSandalsID = config.get(Configuration.CATEGORY_ITEM, "Hemp Sandals", 5122).getInt();
        // Blocks
        pearlstoneID = config.get(Configuration.CATEGORY_BLOCK, "Pearly Stone", 510).getInt();
        blackPearlstoneID = config.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone", 511).getInt();
        pearlstoneBrickID = config.get(Configuration.CATEGORY_BLOCK, "Pearly Stone Brick", 512).getInt();
        blackPearlstoneBrickID = config.get(Configuration.CATEGORY_BLOCK, "Black Pearly Stone Brick", 513).getInt();
        clayOysterID = config.get(Configuration.CATEGORY_BLOCK, "Oyster Yielding Clay", 514).getInt();

        config.save();

        ModInfo.initItem();
        ModInfo.initTools();
        ModInfo.initArmor();
        ModInfo.initBlock();
        ModInfo.languageRegistry();
        ModInfo.crafting();
        /*
         * darkevilmac pointed me to the website
         * http://www.minecraftforum.net/topic
         * /1578638-forge-how-to-edit-vanilla-block-properties/ to help me
         * replace clayGen in the world.
         */
        Block.blocksList[Block.blockClay.blockID] = ModInfo.clayOyster;
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

}
