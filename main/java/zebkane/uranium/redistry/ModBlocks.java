package zebkane.uranium.redistry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import zebkane.uranium.Uranium;
import zebkane.uranium.blocks.DeepslateFluorideOreBlock;
import zebkane.uranium.blocks.DeepslateUraniumOreBlock;
import zebkane.uranium.blocks.FluorideOreBlock;
import zebkane.uranium.blocks.UraniumOreBlock;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block URANIUM_ORE = new UraniumOreBlock(FabricBlockSettings.copy(Blocks.STONE));
    public static final Block DEEPSLATE_URANIUM_ORE = new DeepslateUraniumOreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE));
    public static final Block FLUORIDE_ORE = new FluorideOreBlock(FabricBlockSettings.copy(Blocks.STONE));
    public static final Block DEEPSLATE_FLUORIDE_ORE = new DeepslateFluorideOreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Uranium.MOD_ID, "uranium_ore"), URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Uranium.MOD_ID, "deepslate_uranium_ore"), DEEPSLATE_URANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Uranium.MOD_ID, "fluoride_ore"), FLUORIDE_ORE);
        Registry.register(Registry.BLOCK, new Identifier(Uranium.MOD_ID, "deepslate_fluoride_ore"), DEEPSLATE_FLUORIDE_ORE);
    }
}
