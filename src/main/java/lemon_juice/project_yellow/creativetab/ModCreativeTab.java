package lemon_juice.project_yellow.creativetab;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.block.ModBlocks;
import lemon_juice.project_yellow.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectYellow.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PROJECT_YELLOW_TAB = CREATIVE_MODE_TABS.register("project_yellow", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.project_yellow"))
            .icon(() -> new ItemStack(ModItems.ATHAME.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == PROJECT_YELLOW_TAB.get()){
            event.accept(ModItems.ATHAME.get());

            event.accept(ModItems.AMETHYST_SWORD.get());
            event.accept(ModItems.AMETHYST_SHOVEL.get());
            event.accept(ModItems.AMETHYST_PICKAXE.get());
            event.accept(ModItems.AMETHYST_AXE.get());
            event.accept(ModItems.AMETHYST_HOE.get());

            event.accept(ModItems.AMETHYST_HELMET.get());
            event.accept(ModItems.AMETHYST_CHESTPLATE.get());
            event.accept(ModItems.AMETHYST_LEGGINGS.get());
            event.accept(ModItems.AMETHYST_BOOTS.get());

            event.accept(ModItems.EMERALD_SWORD.get());
            event.accept(ModItems.EMERALD_SHOVEL.get());
            event.accept(ModItems.EMERALD_PICKAXE.get());
            event.accept(ModItems.EMERALD_AXE.get());
            event.accept(ModItems.EMERALD_HOE.get());

            event.accept(ModItems.EMERALD_HELMET.get());
            event.accept(ModItems.EMERALD_CHESTPLATE.get());
            event.accept(ModItems.EMERALD_LEGGINGS.get());
            event.accept(ModItems.EMERALD_BOOTS.get());

            event.accept(ModItems.PERIDOT_SWORD.get());
            event.accept(ModItems.PERIDOT_SHOVEL.get());
            event.accept(ModItems.PERIDOT_PICKAXE.get());
            event.accept(ModItems.PERIDOT_AXE.get());
            event.accept(ModItems.PERIDOT_HOE.get());

            event.accept(ModItems.PERIDOT_HELMET.get());
            event.accept(ModItems.PERIDOT_CHESTPLATE.get());
            event.accept(ModItems.PERIDOT_LEGGINGS.get());
            event.accept(ModItems.PERIDOT_BOOTS.get());

            event.accept(ModItems.RUBY_SWORD.get());
            event.accept(ModItems.RUBY_SHOVEL.get());
            event.accept(ModItems.RUBY_PICKAXE.get());
            event.accept(ModItems.RUBY_AXE.get());
            event.accept(ModItems.RUBY_HOE.get());

            event.accept(ModItems.RUBY_HELMET.get());
            event.accept(ModItems.RUBY_CHESTPLATE.get());
            event.accept(ModItems.RUBY_LEGGINGS.get());
            event.accept(ModItems.RUBY_BOOTS.get());

            event.accept(ModItems.SAPPHIRE_SWORD.get());
            event.accept(ModItems.SAPPHIRE_SHOVEL.get());
            event.accept(ModItems.SAPPHIRE_PICKAXE.get());
            event.accept(ModItems.SAPPHIRE_AXE.get());
            event.accept(ModItems.SAPPHIRE_HOE.get());

            event.accept(ModItems.SAPPHIRE_HELMET.get());
            event.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
            event.accept(ModItems.SAPPHIRE_LEGGINGS.get());
            event.accept(ModItems.SAPPHIRE_BOOTS.get());

            event.accept(ModItems.WOODEN_SICKLE.get());
            event.accept(ModItems.STONE_SICKLE.get());
            event.accept(ModItems.IRON_SICKLE.get());
            event.accept(ModItems.GOLDEN_SICKLE.get());
            event.accept(ModItems.DIAMOND_SICKLE.get());
            event.accept(ModItems.NETHERITE_SICKLE.get());
            event.accept(ModItems.AMETHYST_SICKLE.get());
            event.accept(ModItems.EMERALD_SICKLE.get());
            event.accept(ModItems.PERIDOT_SICKLE.get());
            event.accept(ModItems.RUBY_SICKLE.get());
            event.accept(ModItems.SAPPHIRE_SICKLE.get());

            event.accept(ModBlocks.PERIDOT_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE.get());
            event.accept(ModBlocks.RUBY_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
            event.accept(ModBlocks.SAPPHIRE_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

            event.accept(ModBlocks.BIOTITE.get());
            event.accept(ModBlocks.BIOTITE_SLAB.get());
            event.accept(ModBlocks.BIOTITE_STAIRS.get());
            event.accept(ModBlocks.BIOTITE_WALL.get());

            event.accept(ModBlocks.BIOTITE_BRICKS.get());
            event.accept(ModBlocks.BIOTITE_BRICKS_SLAB.get());
            event.accept(ModBlocks.BIOTITE_BRICKS_STAIRS.get());
            event.accept(ModBlocks.BIOTITE_BRICKS_WALL.get());

            event.accept(ModBlocks.COBBLED_BIOTITE.get());
            event.accept(ModBlocks.COBBLED_BIOTITE_SLAB.get());
            event.accept(ModBlocks.COBBLED_BIOTITE_STAIRS.get());
            event.accept(ModBlocks.COBBLED_BIOTITE_WALL.get());

            event.accept(ModBlocks.MARBLE.get());
            event.accept(ModBlocks.MARBLE_SLAB.get());
            event.accept(ModBlocks.MARBLE_STAIRS.get());
            event.accept(ModBlocks.MARBLE_WALL.get());

            event.accept(ModBlocks.MARBLE_BRICKS.get());
            event.accept(ModBlocks.MARBLE_BRICKS_SLAB.get());
            event.accept(ModBlocks.MARBLE_BRICKS_STAIRS.get());
            event.accept(ModBlocks.MARBLE_BRICKS_WALL.get());

            event.accept(ModBlocks.COBBLED_MARBLE.get());
            event.accept(ModBlocks.COBBLED_MARBLE_SLAB.get());
            event.accept(ModBlocks.COBBLED_MARBLE_STAIRS.get());
            event.accept(ModBlocks.COBBLED_MARBLE_WALL.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
