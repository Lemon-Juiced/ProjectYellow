package lemon_juice.project_yellow.item.custom.tools;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModShovelItem extends ShovelItem {
    public ModShovelItem(Tier tier, Properties properties) {
        super(tier, 1.5F, -3.0F, properties);
    }
}
