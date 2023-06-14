package lemon_juice.project_yellow.item;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.item.custom.AthameItem;
import lemon_juice.project_yellow.item.custom.tiers.ModTiers;
import lemon_juice.project_yellow.item.custom.tools.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ProjectYellow.MOD_ID);

    public static final RegistryObject<Item> ATHAME = ITEMS.register("athame", () -> new AthameItem(ModTiers.ATHAME_TIER, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword", () -> new ModSwordItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel", () -> new ModShovelItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe", () -> new ModPickaxeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_AXE = ITEMS.register("peridot_axe", () -> new ModAxeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe", () -> new ModHoeItem(ModTiers.PERIDOT_TIER, new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
