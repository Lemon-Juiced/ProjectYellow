package lemon_juice.project_yellow.item.custom.tiers;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    // Special Tiers
    public static final Tier ATHAME_TIER = TierSortingRegistry.registerTier(new ForgeTier(0, 250, 2.0F, 0.0F, 15, BlockTags.SWORD_EFFICIENT, () -> Ingredient.of(Items.NETHERITE_INGOT)), new ResourceLocation(ProjectYellow.MOD_ID, "athame"), List.of(), List.of());

    // Modded Gem Tiers
    public static final Tier PERIDOT_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_PERIDOT)), new ResourceLocation(ProjectYellow.MOD_ID, "peridot"), List.of(Tiers.STONE), List.of(Tiers.DIAMOND));
    public static final Tier RUBY_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_RUBY)), new ResourceLocation(ProjectYellow.MOD_ID, "ruby"), List.of(Tiers.STONE), List.of(Tiers.DIAMOND));
    public static final Tier SAPPHIRE_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 906, 7.0F, 2.5F, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModTags.Items.GEMS_SAPPHIRE)), new ResourceLocation(ProjectYellow.MOD_ID, "sapphire"), List.of(Tiers.STONE), List.of(Tiers.DIAMOND));

    // Vanilla Gem Tiers
    public static final Tier AMETHYST_TIER = TierSortingRegistry.registerTier(new ForgeTier(2, 191, 8.0F, 2.0F, 14, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Items.AMETHYST_SHARD)), new ResourceLocation(ProjectYellow.MOD_ID, "amethyst"), List.of(Tiers.STONE), List.of(Tiers.DIAMOND));
    public static final Tier EMERALD_TIER = TierSortingRegistry.registerTier(new ForgeTier(3, 906, 6.0F, 3.0F, 5, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.EMERALD)), new ResourceLocation(ProjectYellow.MOD_ID, "emerald"), List.of(Tiers.IRON), List.of(Tiers.NETHERITE));
}
