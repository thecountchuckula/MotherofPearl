package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import tcc.MotherOfPearl.ModMain;
import tcc.MotherOfPearl.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.lib.ItemStacks;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ModBlocks {

	public static Block pearlstoneFence;
	public static Block pearlCobblestoneFence;
	public static Block pearlstoneBrickFence;
	public static Block blackPearlCobblestoneFence;
	public static Block blackPearlstoneBrickFence;
	public static Block blackPearlstoneFence;
	public static Block pearlstone;
	public static Block pearlCobblestone;
	public static Block blackPearlCobblestone;
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
		pearlstoneFence = new BlockFence(
				MOPConfiguration.pearlstoneFenceID, Reference.MOD_ID.toLowerCase() + ":pearlstone", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("pearlstoneFence")
				.setCreativeTab(ModMain.tabMoP);
	    pearlCobblestoneFence = new BlockFence(
	    		MOPConfiguration.pearlCobblestoneFenceID, Reference.MOD_ID.toLowerCase() + ":pearlCobblestone", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("pearlCobblestoneFence")
				.setCreativeTab(ModMain.tabMoP);
	    pearlstoneBrickFence = new BlockFence(
	    		MOPConfiguration.pearlstoneBrickFenceID, Reference.MOD_ID.toLowerCase() + ":pearlstoneBrick", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("pearlstoneBrickFence")
				.setCreativeTab(ModMain.tabMoP);
	    blackPearlCobblestoneFence = new BlockFence(
	    		MOPConfiguration.blackPearlCobblestoneFenceID, Reference.MOD_ID.toLowerCase() + ":blackPearlCobblestone", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("blackPearlCobblestoneFence")
				.setCreativeTab(ModMain.tabMoP);
	    blackPearlstoneBrickFence = new BlockFence(
	    		MOPConfiguration.blackPearlstoneBrickFenceID, Reference.MOD_ID.toLowerCase() + ":blackPearlstoneBrick", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("blackPearlstoneBrickFence")
				.setCreativeTab(ModMain.tabMoP);
	    blackPearlstoneFence = new BlockFence(
	    		MOPConfiguration.blackPearlstoneFenceID, Reference.MOD_ID.toLowerCase() + ":blackPearlstone", Material.rock)
				.setHardness(3F)
				.setUnlocalizedName("blackPearlstoneFence")
	    		.setCreativeTab(ModMain.tabMoP);
		pearlCobblestone = new BlockPearlCobbleStone(
				MOPConfiguration.pearlCobblestoneID, Material.rock);
		pearlstone = new BlockPearlStone(MOPConfiguration.pearlstoneID,
				Material.rock);
		blackPearlCobblestone = new BlockBlackPearlCobbleStone(
				MOPConfiguration.blackPearlCobblestoneID, Material.rock);
		blackPearlstone = new BlockBlackPearlStone(
				MOPConfiguration.blackPearlstoneID, Material.rock);
		pearlstoneBrick = new BlockPearlStoneBrick(
				MOPConfiguration.pearlstoneBrickID, Material.rock);
		blackPearlstoneBrick = new BlockBlackPearlStoneBrick(
				MOPConfiguration.blackPearlstoneBrickID, Material.rock);
		clayOyster = new BlockOysterClay(MOPConfiguration.clayOysterID,
				Material.clay);
		classicClay = new BlockClassicClay(MOPConfiguration.classicClayID,
				Material.clay);
	}

	public static void initHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(pearlstoneFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pearlCobblestoneFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pearlstoneBrickFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlCobblestoneFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlstoneBrickFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlstoneFence, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pearlCobblestone, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pearlstone, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlCobblestone, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlstone, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(pearlstoneBrick, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(blackPearlstoneBrick, "Pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(clayOyster, "Shovel", 1);
		MinecraftForge.setBlockHarvestLevel(classicClay, "Shovel", 1);
	}

	public static void initGameRegistry() {
		GameRegistry.registerBlock(pearlstoneFence, "pearlstoneFence");
		GameRegistry.registerBlock(pearlCobblestoneFence, "pearlCobblestoneFence");
		GameRegistry.registerBlock(pearlstoneBrickFence, "pearlstoneBrickFence");
		GameRegistry.registerBlock(blackPearlCobblestoneFence, "blackPearlCobblestoneFence");
		GameRegistry.registerBlock(blackPearlstoneBrickFence, "blackPearlstoneBrickFence");
		GameRegistry.registerBlock(blackPearlstoneFence, "blackPearlstoneFence");
		GameRegistry.registerBlock(pearlCobblestone, "pearlCobblestone");
		GameRegistry.registerBlock(pearlstone, "pearlstone");
		GameRegistry.registerBlock(blackPearlCobblestone, "blackPearlCobblestone");
		GameRegistry.registerBlock(blackPearlstone, "blackPearlstone");
		GameRegistry.registerBlock(pearlstoneBrick, "pearlstoneBrick");
		GameRegistry.registerBlock(blackPearlstoneBrick, "blackPearlstoneBrick");
		GameRegistry.registerBlock(clayOyster, "clayOyster");
		GameRegistry.registerBlock(classicClay, "classicClay");
	}

	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(pearlstoneFence, 6), "sss", "sss", 's', pearlstone);
		GameRegistry.addRecipe(new ItemStack(pearlCobblestoneFence, 6), "sss", "sss", 's', pearlCobblestone);
		GameRegistry.addRecipe(new ItemStack(pearlstoneBrickFence, 6), "sss", "sss", 's', pearlstoneBrick);
		GameRegistry.addRecipe(new ItemStack(blackPearlCobblestoneFence, 6), "sss", "sss", 's', blackPearlCobblestone);
		GameRegistry.addRecipe(new ItemStack(blackPearlstoneBrickFence, 6), "sss", "sss", 's', blackPearlstoneBrick);
		GameRegistry.addRecipe(new ItemStack(blackPearlstoneFence, 6), "sss", "sss", 's', blackPearlstone);
		GameRegistry.addRecipe(new ItemStack(pearlCobblestone, 4), "byb", "yby", "byb", 'b', ModItems.pearl, 'y', ItemStacks.cobblestone);
		GameRegistry.addRecipe(new ItemStack(pearlstone, 4), "byb", "yby", "byb", 'b', ModItems.pearl, 'y', ItemStacks.stone);
		GameRegistry.addSmelting(ModBlocks.pearlCobblestone.blockID, ItemStacks.pearlstone, 0.1F);
		GameRegistry.addRecipe(new ItemStack(blackPearlCobblestone, 4), "byb", "yby", "byb", 'b', ModItems.blackPearl, 'y', ItemStacks.cobblestone);
		GameRegistry.addSmelting(ModBlocks.blackPearlCobblestone.blockID, ItemStacks.blackPearlstone, 0.1F);
		GameRegistry.addRecipe(new ItemStack(blackPearlstone, 4), "byb", "yby", "byb", 'b', ModItems.blackPearl, 'y', ItemStacks.stone);
		GameRegistry.addRecipe(new ItemStack(pearlstoneBrick, 4), "byb", "yby", "byb", 'b', ModItems.pearl, 'y', ItemStacks.stoneBrick);
		GameRegistry.addRecipe(new ItemStack(blackPearlstoneBrick, 4), "byb", "yby", "byb", 'b', ModItems.blackPearl, 'y', ItemStacks.stoneBrick);
		GameRegistry.addRecipe(new ItemStack(pearlstoneBrick, 4), "yy", "yy", 'y', pearlstone);
		GameRegistry.addRecipe(new ItemStack(blackPearlstoneBrick, 4), "yy", "yy", 'y', blackPearlstone);
		GameRegistry.addShapelessRecipe(new ItemStack(pearlstone, 1),  ModItems.dustPearl, ItemStacks.stone);
		GameRegistry.addShapelessRecipe(new ItemStack(pearlCobblestone, 1),  ModItems.dustPearl, ItemStacks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(pearlstoneBrick, 1),  ModItems.dustPearl, ItemStacks.stoneBrick);
		GameRegistry.addShapelessRecipe(new ItemStack(blackPearlstone, 1),  ModItems.dustBlackPearl, ItemStacks.stone);
		GameRegistry.addShapelessRecipe(new ItemStack(blackPearlCobblestone, 1),  ModItems.dustBlackPearl, ItemStacks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(blackPearlstoneBrick, 1),  ModItems.dustBlackPearl, ItemStacks.stoneBrick);
	}

	public static void initLanguageRegistry() {
		LanguageRegistry.addName(pearlstoneFence, "Pearly Stone Fence");
		LanguageRegistry.addName(pearlCobblestoneFence, "Pearly Cobblestone Fence");
		LanguageRegistry.addName(pearlstoneBrickFence, "Pearly Stone Brick Fence");
		LanguageRegistry.addName(blackPearlCobblestoneFence, "Black Pearly Cobblestone Fence");
		LanguageRegistry.addName(blackPearlstoneBrickFence, "Black Pearly Stone Brick Fence");
		LanguageRegistry.addName(blackPearlstoneFence, "Black Pearly Stone Fence");
		LanguageRegistry.addName(pearlCobblestone, "Pearly Cobblestone");
		LanguageRegistry.addName(pearlstone, "Pearly Stone");
		LanguageRegistry.addName(blackPearlCobblestone,
				"Black Pearly Cobblestone");
		LanguageRegistry.addName(blackPearlstone, "Black Pearly Stone");
		LanguageRegistry.addName(pearlstoneBrick, "Pearly Stone Brick");
		LanguageRegistry.addName(blackPearlstoneBrick,
				"Black Pearly Stone Brick");
		LanguageRegistry.addName(clayOyster, "Clay");
		LanguageRegistry.addName(classicClay, "Clay");
	}

}
