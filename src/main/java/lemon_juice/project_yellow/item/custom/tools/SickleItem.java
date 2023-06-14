package lemon_juice.project_yellow.item.custom.tools;

import com.google.common.collect.Sets;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

/* This file was partially borrowed and modified from Blue Power
 *
 * The original text in the Blue Power ItemSickle.java:
 *     "Blue Power is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Blue Power is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details."
 *
 *     See <http://www.gnu.org/licenses/> for information on the GNU General Public License.
 */

public class SickleItem extends DiggerItem {
    private Item repairItem;

    private static final Set sickleEffectiveBlocks = Sets.newHashSet(ItemTags.LEAVES, BlockTags.CROPS, Blocks.NETHER_WART, Blocks.RED_MUSHROOM, Blocks.BROWN_MUSHROOM, Blocks.SUGAR_CANE, Blocks.TALL_GRASS, Blocks.VINE, Blocks.LILY_PAD, BlockTags.SMALL_FLOWERS);

    public SickleItem(Tier itemTier, Item repairItem) {
        super(2,-1.4F, itemTier, BlockTags.MINEABLE_WITH_HOE, new Properties());
        this.repairItem = repairItem;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        if (state.is(BlockTags.LEAVES) || sickleEffectiveBlocks.contains(state)) return this.speed;
        return 1.0F;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        boolean sickleUsed = false;
        if (!(entityLiving instanceof Player player)) return false;

        if ( state.is(BlockTags.LEAVES) || state.getBlock() instanceof LeavesBlock) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    for (int k = -1; k <= 1; k++) {
                        BlockState checkBlock = world.getBlockState(pos.offset(i,j,k));
                        if (checkBlock.is(BlockTags.LEAVES) || checkBlock.getBlock() instanceof LeavesBlock) {
                            if (checkBlock.canHarvestBlock(world, pos.offset(i,j,k), player)) {
                                world.destroyBlock(pos.offset(i,j,k), true);
                            }
                            sickleUsed = true;
                        }
                    }
                }
            }
            if (sickleUsed) stack.hurtAndBreak(1, player, (playerEntity) -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            return sickleUsed;
        }

        if ((state.getBlock() instanceof WaterlilyBlock)) {
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    Block checkBlock = world.getBlockState(pos.offset(i,0,j)).getBlock();
                    BlockState meta = world.getBlockState(pos.offset(i,0,j));
                    if (checkBlock instanceof WaterlilyBlock) {
                        if (checkBlock.canHarvestBlock(meta, world, pos.offset(i,0,j), player)) {
                            world.destroyBlock(pos.offset(i,0,j), true);
                        }
                        sickleUsed = true;
                    }
                }
            }
        }

        if (!(state.getBlock() instanceof WaterlilyBlock)) {
            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j <= 2; j++) {
                    Block checkBlock = world.getBlockState(pos.offset(i,0,j)).getBlock();
                    if (checkBlock instanceof BushBlock && !(checkBlock instanceof WaterlilyBlock)) {
                        if (checkBlock.canHarvestBlock(world.getBlockState(pos.offset(i,0,j)), world,  pos.offset(i,0,j), player)) {
                            world.destroyBlock(pos.offset(i,0,j), true);
                        }
                        sickleUsed = true;
                    }
                }
            }
        }

        if (sickleUsed) stack.hurtAndBreak(1, player, (playerEntity) -> playerEntity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return sickleUsed;
    }

    @Override
    public boolean isValidRepairItem(ItemStack itemStack1, ItemStack itemStack2) {
        return ((itemStack1.getItem() == this || itemStack2.getItem() == this) && (itemStack1.getItem() == this.repairItem || itemStack2.getItem() == this.repairItem));
    }
}
