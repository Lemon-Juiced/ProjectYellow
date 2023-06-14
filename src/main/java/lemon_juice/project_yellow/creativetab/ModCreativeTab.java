package lemon_juice.project_yellow.creativetab;

import lemon_juice.project_yellow.ProjectYellow;
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

            event.accept(ModItems.PERIDOT_SWORD.get());
            event.accept(ModItems.PERIDOT_SHOVEL.get());
            event.accept(ModItems.PERIDOT_PICKAXE.get());
            event.accept(ModItems.PERIDOT_AXE.get());
            event.accept(ModItems.PERIDOT_HOE.get());

            event.accept(ModItems.PERIDOT_HELMET.get());
            event.accept(ModItems.PERIDOT_CHESTPLATE.get());
            event.accept(ModItems.PERIDOT_LEGGINGS.get());
            event.accept(ModItems.PERIDOT_BOOTS.get());
        }
    }


    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
