package net.fabricmc.example.effect

import net.fabricmc.example.items.stable_creeper
import net.minecraft.entity.Entity
import net.minecraft.entity.ItemEntity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffectType
import net.minecraft.entity.mob.CreeperEntity
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.potion.Potion
import net.minecraft.world.GameRules
import net.minecraft.world.explosion.Explosion.DestructionType


class entity : StatusEffect(
    StatusEffectType.BENEFICIAL,  // whether beneficial or harmful for entities
    0x98D982
) {

    // entity method is called every tick to check whether it should apply the status effect or not
    override fun canApplyUpdateEffect(duration: Int, amplifier: Int): Boolean {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true
    }

    // entity method is called when it applies the status effect. We implement custom functionality here.
    override fun applyUpdateEffect(entity: LivingEntity, amplifier: Int) {
        if (entity is CreeperEntity) {
            val shuff = Math.random()
            if (shuff < 0.25) {
                println(shuff)
                val stack = ItemStack(stable_creeper.stableCreeper)
                var itemEntity: ItemEntity? = ItemEntity(entity.world, entity.x, entity.y, entity.z, stack)
                entity.world.spawnEntity(itemEntity)
                entity.remove(Entity.RemovalReason.DISCARDED)
            } else {
                println(shuff)
                entity.ignite()
            }

        }
    }
}


class creeper_stab_potion : Potion(
    StatusEffectInstance(creeper_stabilize.stab, 1, 1)
)

class creeper_stabilize {
    companion object {

        val stab = entity()
        val stab_potion = creeper_stab_potion()
    }
}