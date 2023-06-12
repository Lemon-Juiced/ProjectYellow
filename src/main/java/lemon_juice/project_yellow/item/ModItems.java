package lemon_juice.project_yellow.item;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.item.custom.AthameItem;
import lemon_juice.project_yellow.item.custom.tiers.ModTiers;
import net.minecraft.world.item.Item;
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

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
