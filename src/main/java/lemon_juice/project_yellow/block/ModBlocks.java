package lemon_juice.project_yellow.block;

import lemon_juice.project_yellow.ProjectYellow;
import lemon_juice.project_yellow.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectYellow.MOD_ID);
    
    // Stone Blocks
    public static final RegistryObject<Block> BIOTITE = registerBlock("basalt", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BIOTITE_STAIRS = registerBlock("basalt_stairs", () ->  new StairBlock(ModBlocks.BIOTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.BIOTITE.get())));
    public static final RegistryObject<Block> BIOTITE_SLAB = registerBlock("basalt_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE.get())));
    public static final RegistryObject<Block> BIOTITE_WALL = registerBlock("basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE.get()).forceSolidOn()));

    public static final RegistryObject<Block> BIOTITE_BRICKS = registerBlock("basalt_bricks", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE.get()).strength(3.5F, 6.0F)));
    public static final RegistryObject<Block> BIOTITE_BRICKS_STAIRS = registerBlock("basalt_bricks_stairs", () ->  new StairBlock(ModBlocks.BIOTITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.BIOTITE_BRICKS.get())));
    public static final RegistryObject<Block> BIOTITE_BRICKS_SLAB = registerBlock("basalt_bricks_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE_BRICKS.get())));
    public static final RegistryObject<Block> BIOTITE_BRICKS_WALL = registerBlock("basalt_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE_BRICKS.get()).forceSolidOn()));

    public static final RegistryObject<Block> COBBLED_BIOTITE = registerBlock("cobbled_basalt", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.BIOTITE.get()).strength(3.5F, 6.0F)));
    public static final RegistryObject<Block> COBBLED_BIOTITE_STAIRS = registerBlock("cobbled_basalt_stairs", () ->  new StairBlock(ModBlocks.COBBLED_BIOTITE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.COBBLED_BIOTITE.get())));
    public static final RegistryObject<Block> COBBLED_BIOTITE_SLAB = registerBlock("cobbled_basalt_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_BIOTITE.get())));
    public static final RegistryObject<Block> COBBLED_BIOTITE_WALL = registerBlock("cobbled_basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_BIOTITE.get()).forceSolidOn()));

    public static final RegistryObject<Block> MARBLE = registerBlock("marble", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs", () ->  new StairBlock(ModBlocks.MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get())));
    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get())));
    public static final RegistryObject<Block> MARBLE_WALL = registerBlock("marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get()).forceSolidOn()));

    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get()).strength(3.5F, 6.0F)));
    public static final RegistryObject<Block> MARBLE_BRICKS_STAIRS = registerBlock("marble_bricks_stairs", () ->  new StairBlock(ModBlocks.MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.MARBLE_BRICKS.get())));
    public static final RegistryObject<Block> MARBLE_BRICKS_SLAB = registerBlock("marble_bricks_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.MARBLE_BRICKS.get())));
    public static final RegistryObject<Block> MARBLE_BRICKS_WALL = registerBlock("marble_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.MARBLE_BRICKS.get()).forceSolidOn()));
    
    public static final RegistryObject<Block> COBBLED_MARBLE = registerBlock("cobbled_marble", () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.MARBLE.get()).strength(3.5F, 6.0F)));
    public static final RegistryObject<Block> COBBLED_MARBLE_STAIRS = registerBlock("cobbled_marble_stairs", () ->  new StairBlock(ModBlocks.COBBLED_MARBLE.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.COBBLED_MARBLE.get())));
    public static final RegistryObject<Block> COBBLED_MARBLE_SLAB = registerBlock("cobbled_marble_slab", () ->  new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_MARBLE.get())));
    public static final RegistryObject<Block> COBBLED_MARBLE_WALL = registerBlock("cobbled_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.COBBLED_MARBLE.get()).forceSolidOn()));


    // Ores
    public static final RegistryObject<Block> PERIDOT_ORE = registerBlock("peridot_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(PERIDOT_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(RUBY_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(SAPPHIRE_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));



    /******************************** Registry ********************************/
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
