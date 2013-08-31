package tcc.MotherOfPearl;

import net.minecraft.item.Item;
import net.minecraftforge.common.DimensionManager;
import tcc.MotherOfPearl.blocks.BlockPearlFire;
import tcc.MotherOfPearl.blocks.BlockPearlPortal;
import tcc.MotherOfPearl.items.ItemPearlFlintAndSteel;
import tcc.MotherOfPearl.items.ItemPortalPlacer;
import tcc.MotherOfPearl.lib.BlockIDs;
import tcc.MotherOfPearl.lib.DimensionIDs;
import tcc.MotherOfPearl.lib.ItemIDs;
import tcc.MotherOfPearl.lib.Names;
import tcc.MotherOfPearl.world.WorldProviderPearl;
import tcc.MotherOfPearl.world.gen.WorldGenModOre;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.lib.Reference;

//@Mod(modid="pearl", name=Reference.NAME, version=Reference.version)
//@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Main
{	
	/** Dimension ID **/
	public static int DimID = DimensionIDs.DIMID_1;

	/** Blocks **/
	public static BlockPearlFire PearlFire = (BlockPearlFire)new BlockPearlFire(BlockIDs.PearlFireID).setUnlocalizedName(Names.UL_PearlFire);
	public static BlockPearlPortal PearlPortal = (BlockPearlPortal)new BlockPearlPortal(BlockIDs.PearlPortalID).setUnlocalizedName(Names.UL_PearlPortal);
	
	/** Items **/
	public static Item PearlFlintAndSteel = new ItemPearlFlintAndSteel(ItemIDs.PearlFlintID).setUnlocalizedName(Names.UL_Lighter);
	public static Item PearlPortalPlacer = new ItemPortalPlacer(ItemIDs.PearlPortalPlacerID).setUnlocalizedName(Names.UL_PortalPlacer);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void loadPort()
	{
		/** Register Blocks **/
		GameRegistry.registerBlock(PearlFire, "PearlFire");
		GameRegistry.registerBlock(PearlPortal, "PearlPortal");
		
		/** Register Items **/
		GameRegistry.registerItem(PearlFlintAndSteel, "PearlFlintAndSteel");
		GameRegistry.registerItem(PearlPortalPlacer, "PearlPortalPlacer");
		
		/** Add In-Game Names **/
		LanguageRegistry.addName(PearlFire, Names.PearlFire);
		LanguageRegistry.addName(PearlPortal, Names.PearlPortal);
		LanguageRegistry.addName(PearlFlintAndSteel, Names.Lighter);
		LanguageRegistry.addName(PearlPortalPlacer, Names.PortalPlacer);
		
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(DimID, WorldProviderPearl.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		
		
		/** Ore Generator **/
		GameRegistry.registerWorldGenerator(new WorldGenModOre());
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}