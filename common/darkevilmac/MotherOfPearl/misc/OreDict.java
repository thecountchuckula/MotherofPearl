package darkevilmac.MotherOfPearl.misc;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tcc.MotherOfPearl.items.ModItems;

public class OreDict {

    public static void init() {

        OreDictionary.registerOre("dustGold", new ItemStack(ModItems.dustGold));
        OreDictionary.registerOre("dustIron", new ItemStack(ModItems.dustIron));

    }
}
