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

    // Sapphire

    // Sickles
    public static final RegistryObject<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle", () -> new SickleItem(Tiers.WOOD, "wood"));
    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle", () -> new SickleItem(Tiers.STONE, "cobblestone"));
    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle", () -> new SickleItem(Tiers.IRON, Items.IRON_INGOT));
    public static final RegistryObject<Item> GOLDEN_SICKLE = ITEMS.register("golden_sickle", () -> new SickleItem(Tiers.GOLD, Items.GOLD_INGOT));
    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle", () -> new SickleItem(Tiers.DIAMOND, Items.DIAMOND));
    public static final RegistryObject<Item> NETHERITE_SICKLE = ITEMS.register("netherite_sickle", () -> new SickleItem(Tiers.NETHERITE, Items.NETHERITE_INGOT));
    public static final RegistryObject<Item> PERIDOT_SICKLE = ITEMS.register("peridot_sickle", () -> new SickleItem(ModTiers.PERIDOT_TIER, "peridot"));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
