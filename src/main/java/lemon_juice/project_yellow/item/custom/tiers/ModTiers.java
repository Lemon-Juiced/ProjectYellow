package lemon_juice.project_yellow.item.custom.tiers;

import lemon_juice.project_yellow.tags.ModTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    // Special Tiers
    public static final ForgeTier ATHAME_TIER = new ForgeTier(0, 250, 2.0F, 0.0F, 15, BlockTags.SWORD_EFFICIENT, () -> Ingredient.of(Items.IRON_INGOT));

    // Modded Gem Tiers
    public static final ForgeTier PERIDOT_TIER = new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_PERIDOT));
    public static final ForgeTier RUBY_TIER = new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_RUBY));
    public static final ForgeTier SAPPHIRE_TIER = new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_SAPPHIRE));

    // Vanilla Gem Tiers
    public static final ForgeTier AMETHYST_TIER = new ForgeTier(2, 191, 8.0F, 3.0F, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD));
    public static final ForgeTier EMERALD_TIER = new ForgeTier(3, 906, 6.0F, 3.0F, 5, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD));

}
