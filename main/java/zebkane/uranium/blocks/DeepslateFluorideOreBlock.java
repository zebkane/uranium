package zebkane.uranium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class DeepslateFluorideOreBlock extends Block {
    public DeepslateFluorideOreBlock(Settings settings) {
        super(settings);
    }

    protected int getExperienceWhenMined(Random random) {
        return MathHelper.nextInt((net.minecraft.util.math.random.Random) random, 5, 8);
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            int i = this.getExperienceWhenMined((Random) world.random);
            if (i > 0) {
                this.dropExperience(world, pos, i);
            }
        }
    }
}
