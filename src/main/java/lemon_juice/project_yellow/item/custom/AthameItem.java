package lemon_juice.project_yellow.item.custom;

import com.mojang.datafixers.util.Either;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderOwner;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Does 25 damage to Endermen
 */
public class AthameItem extends SwordItem {

    public AthameItem(Tier tier, Properties properties) {
        super(tier, 1, 1.0f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity damagedEntity, LivingEntity userEntity) {
        // This is very ugly, but it works, and I'm not questioning it...
        Holder<DamageType> damageTypeHolder = new Holder<DamageType>() {
            @Override
            public DamageType value() {
                return null;
            }

            @Override
            public boolean isBound() {
                return false;
            }

            @Override
            public boolean is(ResourceLocation p_205713_) {
                return false;
            }

            @Override
            public boolean is(ResourceKey<DamageType> p_205712_) {
                return false;
            }

            @Override
            public boolean is(Predicate<ResourceKey<DamageType>> p_205711_) {
                return false;
            }

            @Override
            public boolean is(TagKey<DamageType> p_205705_) {
                return false;
            }

            @Override
            public Stream<TagKey<DamageType>> tags() {
                return null;
            }

            @Override
            public Either<ResourceKey<DamageType>, DamageType> unwrap() {
                return null;
            }

            @Override
            public Optional<ResourceKey<DamageType>> unwrapKey() {
                return Optional.empty();
            }

            @Override
            public Kind kind() {
                return null;
            }

            @Override
            public boolean canSerializeIn(HolderOwner<DamageType> p_255833_) {
                return false;
            }
        };

        if(damagedEntity instanceof EnderMan enderManEntity) enderManEntity.hurt(new DamageSource(damageTypeHolder), 25.0F);

        return super.hurtEnemy(itemStack, damagedEntity, userEntity);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.project_yellow.athame"));
    }
}
