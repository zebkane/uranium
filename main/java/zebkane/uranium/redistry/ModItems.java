package zebkane.uranium.redistry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import zebkane.uranium.Uranium;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RAW_URANIUM = new Item(new Item.Settings().group(Uranium.URANIUM));
    public static final Item MILLING_CHEMiCALS = new Item(new Item.Settings().group(Uranium.URANIUM));
    public static final Item FLUORIDE = new Item(new Item.Settings().group(Uranium.URANIUM));
    public static final Item ENRICHED_URANIUM_INGOT = new Item(new Item.Settings().group(Uranium.URANIUM));
    public static final Item MILLED_URANIUM = new Item(new Item.Settings().group(Uranium.URANIUM));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "raw_uranium"), RAW_URANIUM);
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "milling_chemicals"), MILLING_CHEMiCALS);
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "fluoride"), FLUORIDE);
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "enriched_uranium_ingot"), ENRICHED_URANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "milled_uranium"), MILLED_URANIUM);

        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "uranium_ore"), new BlockItem(ModBlocks.URANIUM_ORE, new Item.Settings().group(Uranium.URANIUM)));
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "deepslate_uranium_ore"), new BlockItem(ModBlocks.DEEPSLATE_URANIUM_ORE, new Item.Settings().group(Uranium.URANIUM)));
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "fluoride_ore"), new BlockItem(ModBlocks.FLUORIDE_ORE, new Item.Settings().group(Uranium.URANIUM)));
        Registry.register(Registry.ITEM, new Identifier(Uranium.MOD_ID, "deepslate_fluoride_ore"), new BlockItem(ModBlocks.DEEPSLATE_FLUORIDE_ORE, new Item.Settings().group(Uranium.URANIUM)));
    }
}
