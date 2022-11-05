package zebkane.uranium;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import zebkane.uranium.redistry.ModBlocks;
import zebkane.uranium.redistry.ModItems;

public class Uranium implements ModInitializer {

	public static final String MOD_ID = "uranium";

	public static final ItemGroup URANIUM = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "uranium"), () -> new ItemStack(ModItems.ENRICHED_URANIUM_INGOT));

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
}
