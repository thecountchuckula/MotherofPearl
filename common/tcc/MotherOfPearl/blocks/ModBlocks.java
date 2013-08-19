package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import tcc.MotherOfPearl.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.lib.ItemStacks;

public class ModBlocks {

    public static Block pearlstone;
    public static Block blackPearlstone;
    public static Block pearlstoneBrick;
    public static Block blackPearlstoneBrick;
    public static Block clayOyster;
    public static Block classicClay;

    public static void init() {
        defBlocks();
        initHarvestLevels();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defBlocks() {
        pearlstone = new BlockPearlStone(MOPConfiguration.pearlstoneID, Material.rock);
        blackPearlstone = new BlockBlackPearlStone(MOPConfiguration.blackPearlstoneID, Material.rock);
        pearlstoneBrick = new BlockPearlStoneBrick(MOPConfiguration.pearlstoneBrickID, Material.rock);
        blackPearlstoneBrick = new BlockBlackPearlStoneBrick(MOPConfiguration.blackPearlstoneBrickID, Material.rock);
        clayOyster = new BlockOysterClay(MOPConfiguration.clayOysterID, Material.clay);
        classicClay = new BlockClassicClay(MOPConfiguration.classicClayID);
    }

    public static void initHarvestLevels() {
        MinecraftForge.setBlockHarvestLevel(pearlstone, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(blackPearlstone, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(pearlstoneBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(blackPearlstoneBrick, "Pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(clayOyster, "Shovel", 1);
        MinecraftForge.setBlockHarvestLevel(classicClay, "Shovel", 1);
    }

    public static void initGameRegistry() {
        GameRegistry.registerBlock(pearlstone, "pearlstone");
        GameRegistry.registerBlock(blackPearlstone, "blackPearlstone");
        GameRegistry.registerBlock(pearlstoneBrick, "pearlstoneBrick");
        GameRegistry.registerBlock(blackPearlstoneBrick, "blackPearlstoneBrick");
        GameRegistry.registerBlock(clayOyster, "clayOyster");
        GameRegistry.registerBlock(classicClay, "classicClay");
    }

    public static void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(pearlstone, 4), "byb", "yby", "byb", 'b', ModItems.pearl, 'y', ItemStacks.stone);
        GameRegistry.addRecipe(new ItemStack(blackPearlstone, 4), "byb", "yby", "byb", 'b', ModItems.blackPearl, 'y', ItemStacks.stone);
        GameRegistry.addRecipe(new ItemStack(pearlstoneBrick, 4), "byb", "yby", "byb", 'b', ModItems.pearl, 'y', ItemStacks.stoneBrick);
        GameRegistry.addRecipe(new ItemStack(blackPearlstoneBrick, 4), "byb", "yby", "byb", 'b', ModItems.blackPearl, 'y', ItemStacks.stoneBrick);
        GameRegistry.addRecipe(new ItemStack(pearlstoneBrick, 4), "yy", "yy", 'y', pearlstone);
        GameRegistry.addRecipe(new ItemStack(blackPearlstoneBrick, 4), "yy", "yy", 'y', blackPearlstone);
    }

    public static void initLanguageRegistry() {
        LanguageRegistry.addName(pearlstone, "Pearly Stone");
        LanguageRegistry.addName(blackPearlstone, "Black Pearly Stone");
        LanguageRegistry.addName(pearlstoneBrick, "Pearly Stone Brick");
        LanguageRegistry.addName(blackPearlstoneBrick, "Black Pearly Stone Brick");
        LanguageRegistry.addName(clayOyster, "Clay");
        LanguageRegistry.addName(classicClay, "Clay");
    }

}
