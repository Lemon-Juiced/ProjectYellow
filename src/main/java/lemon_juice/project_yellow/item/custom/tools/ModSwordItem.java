package lemon_juice.project_yellow.item.custom.tools;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(Tier tier, Properties properties) {
        super(tier, 3, -2.4F, properties);
    }
}
