package lemon_juice.project_yellow.item.custom.tools;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(Tier tier, Properties properties) {
        super(tier, 1, -2.8F, properties);
    }
}
