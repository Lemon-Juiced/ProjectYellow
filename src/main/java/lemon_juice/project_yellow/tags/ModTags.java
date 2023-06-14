package lemon_juice.project_yellow.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static void init() {
        Items.init();
    }

    private ModTags() {}

    public static class Items {
        private static void init() {}
        private Items() {}

        public static final TagKey<Item> GEMS_PERIDOT = forgeTag("gems/peridot");
        public static final TagKey<Item> GEMS_RUBY = forgeTag("gems/ruby");
        public static final TagKey<Item> GEMS_SAPPHIRE = forgeTag("gems/sapphire");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
