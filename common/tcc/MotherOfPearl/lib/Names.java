package tcc.MotherOfPearl.lib;

import net.minecraft.block.Block;

public class Names 
{
	private static int blockID;
	
	/** ALL NAMES **/    //UL = UnlocalizedName
	public static final String UL_PearlFire = "PearlFire_0";
	public static final String UL_PearlPortal = "PearlPortal";
	public static final String UL_PearlGrass = "PearlGrass";
	public static final String UL_PearlDirt = "Dirt";
	public static final String UL_PearlStone = "Stone";
	public static final String UL_Lighter = "Lighter";
	public static final String UL_PortalPlacer = "PortalPlacer";
	public static final String UL_PearlLeaf = "Leaf";
	public static final String UL_PearlLog = "LogSide0";
	public static final String UL_PearlSapling = "Sapling0";
	
	/** IN GAME NAMES **/
	public static final String PearlFire = "Pearl Fire";
	public static final String PearlPortal = "Pearl Portal";
	public static final String PearlGrass = "Pearl Grass";
	public static final String PearlDirt = "Pearl Dirt";
	public static final String PearlStone = "Pearl Stone";
	public static final String Lighter = "Pearl Lighter";
	public static final String PortalPlacer = "Portal Placer";
	public static final String PearlLeaf = "Pearl Leaf";
	public static final String PearlLog = "Pearl Log";
	public static final String PearlSapling = "Pearl Sapling";

	/** gets the In game name **/
	public static String getGameName()
	{
		if(blockID == 2000)
		{
			return Names.PearlFire;
		}
		if(blockID == 2001)
		{
			return Names.PearlPortal;
		}
		if(blockID == 200)
		{
			return Names.PearlGrass;
		}
		if(blockID == 201)
		{
			return Names.PearlDirt;
		}
		if(blockID == 202)
		{
			return Names.PearlStone;
		}
		return null;
	}
}
