package tcc.MotherOfPearl.items;

import tcc.MotherOfPearl.tools.ModTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.lib.ItemStacks;

public class ModItems {

    public static Item blackPearl;
    public static Item oyster;
    public static Item oysterMeat;
    public static Item pearl;
    public static Item shell;
    public static Item pearlDiamond;
    public static Item blackPearlDiamond;

    public static void init() {
        defItems();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defItems() {
        blackPearl = new ItemBlackPearl(MOPConfiguration.blackPearlID);
        oyster = new ItemOyster(MOPConfiguration.oysterID);
        oysterMeat = new ItemOysterMeat(MOPConfiguration.oysterMeatID, true, 4);
        pearl = new ItemPearl(MOPConfiguration.pearlID);
        shell = new ItemShell(MOPConfiguration.shellID);
        pearlDiamond = new ItemPearlDiamond(MOPConfiguration.pearlDiamondID);
        blackPearlDiamond = new ItemBlackPearlDiamond(MOPConfiguration.blackPearlDiamondID);
    }

    public static void initGameRegistry() {

    }

    public static void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(blackPearl, 8), "yyy", "yby", "yyy", 'b', ItemStacks.inkSac, 'y', pearl);
        GameRegistry.addSmelting(oyster.itemID, new ItemStack(oysterMeat), 0.1f);
        GameRegistry.addShapelessRecipe(ItemStacks.blackPearlDiamond, ItemStacks.blackPearl, ItemStacks.diamond);
        GameRegistry.addShapelessRecipe(ItemStacks.pearlDiamond, ItemStacks.pearl, ItemStacks.diamond);
        // Uses Pearling Knife to split an oyster into two shells. Gets 30 uses, making a total of 60 shells.
        // (If only used in the crafting recipe.)
        // Thank you to DeverionX for the great tutorial on MinecraftForums.
        GameRegistry.addShapelessRecipe(new ItemStack(shell, 2), ItemStacks.oyster, ItemStacks.knifePearl);
        //Using the Pearling Knife to make pearls from Oysters. Again 30 Uses makes 240 Pearls (@8 pearls for each use)
        GameRegistry.addRecipe(new ItemStack(pearl, 8), "yyy", "yxy", "yyy", 'x', ItemStacks.knifePearl, 'y', oyster);
    }

    public static void initLanguageRegistry() {
        LanguageRegistry.addName(blackPearl, "Black Pearl");
        LanguageRegistry.addName(oyster, "Oyster");
        LanguageRegistry.addName(oysterMeat, "Oyster Meat");
        LanguageRegistry.addName(pearl, "Pearl");
        LanguageRegistry.addName(shell, "Shell");
        LanguageRegistry.addName(pearlDiamond, "Pearly Diamond");
        LanguageRegistry.addName(blackPearlDiamond, "Black Pearly Diamond"); 
    }

}
