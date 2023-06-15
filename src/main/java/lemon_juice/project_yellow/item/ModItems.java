package lemon_juice.project_yellow.item;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.item.custom.tiers.ModArmorMaterials;
import lemon_juice.project_yellow.item.custom.tiers.ModTiers;
import lemon_juice.project_yellow.item.custom.tools.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectYellow.MOD_ID);

    // Unique Items
    public static final RegistryObject<Item> ATHAME = ITEMS.register("athame", () -> new AthameItem(ModTiers.ATHAME_TIER, new Item.Properties()));

    // Vanilla+

    // Amethyst
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new ModSwordItem(ModTiers.AMETHYST_TIER, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ModShovelItem(ModTiers.AMETHYST_TIER, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new ModPickaxeItem(ModTiers.AMETHYST_TIER, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new ModAxeItem(ModTiers.AMETHYST_TIER, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new ModHoeItem(ModTiers.AMETHYST_TIER, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Emerald
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new ModSwordItem(ModTiers.EMERALD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ModShovelItem(ModTiers.EMERALD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new ModPickaxeItem(ModTiers.EMERALD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new ModAxeItem(ModTiers.EMERALD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new ModHoeItem(ModTiers.EMERALD_TIER, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Mod Based

    // Peridot
    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword", () -> new ModSwordItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel", () -> new ModShovelItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe", () -> new ModPickaxeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_AXE = ITEMS.register("peridot_axe", () -> new ModAxeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe", () -> new ModHoeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_HELMET = ITEMS.register("peridot_helmet", () -> new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_CHESTPLATE = ITEMS.register("peridot_chestplate", () -> new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_LEGGINGS = ITEMS.register("peridot_leggings", () -> new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_BOOTS = ITEMS.register("peridot_boots", () -> new ArmorItem(ModArmorMaterials.PERIDOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Ruby
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new ModSwordItem(ModTiers.RUBY_TIER, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ModShovelItem(ModTiers.RUBY_TIER, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new ModPickaxeItem(ModTiers.RUBY_TIER, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new ModAxeItem(ModTiers.RUBY_TIER, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new ModHoeItem(ModTiers.RUBY_TIER, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new ModSwordItem(ModTiers.SAPPHIRE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ModShovelItem(ModTiers.SAPPHIRE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new ModPickaxeItem(ModTiers.SAPPHIRE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new ModAxeItem(ModTiers.SAPPHIRE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new ModHoeItem(ModTiers.SAPPHIRE_TIER, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Sickles
    public static final RegistryObject<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle", () -> new SickleItem(Tiers.WOOD, "wood"));
    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle", () -> new SickleItem(Tiers.STONE, "cobblestone"));
    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle", () -> new SickleItem(Tiers.IRON, Items.IRON_INGOT));
    public static final RegistryObject<Item> GOLDEN_SICKLE = ITEMS.register("golden_sickle", () -> new SickleItem(Tiers.GOLD, Items.GOLD_INGOT));
    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle", () -> new SickleItem(Tiers.DIAMOND, Items.DIAMOND));
    public static final RegistryObject<Item> NETHERITE_SICKLE = ITEMS.register("netherite_sickle", () -> new SickleItem(Tiers.NETHERITE, Items.NETHERITE_INGOT));
    public static final RegistryObject<Item> AMETHYST_SICKLE = ITEMS.register("amethyst_sickle", () -> new SickleItem(ModTiers.AMETHYST_TIER, Items.AMETHYST_SHARD));
    public static final RegistryObject<Item> EMERALD_SICKLE = ITEMS.register("emerald_sickle", () -> new SickleItem(ModTiers.EMERALD_TIER, Items.EMERALD));
    public static final RegistryObject<Item> PERIDOT_SICKLE = ITEMS.register("peridot_sickle", () -> new SickleItem(ModTiers.PERIDOT_TIER, "peridot"));
    public static final RegistryObject<Item> RUBY_SICKLE = ITEMS.register("ruby_sickle", () -> new SickleItem(ModTiers.RUBY_TIER, "ruby"));
    public static final RegistryObject<Item> SAPPHIRE_SICKLE = ITEMS.register("sapphire_sickle", () -> new SickleItem(ModTiers.SAPPHIRE_TIER, "sapphire"));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
