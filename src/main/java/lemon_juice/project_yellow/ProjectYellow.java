package lemon_juice.project_yellow;

import lemon_juice.project_yellow.creativetab.ModCreativeTab;
import lemon_juice.project_yellow.item.ModItems;
import lemon_juice.project_yellow.tags.ModTags;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ProjectYellow.MOD_ID)
public class ProjectYellow {
    public static final String MOD_ID = "project_yellow";

    public ProjectYellow() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        //ModBlocks.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        // Register Tags
        ModTags.init();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
