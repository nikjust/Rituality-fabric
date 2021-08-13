package net.fabricmc.example.block

import net.fabricmc.example.items.stable_creeper
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.entity.Entity
import net.minecraft.entity.ItemEntity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.effect.StatusEffect
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffectType
import net.minecraft.entity.mob.CreeperEntity
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.potion.Potion
import net.minecraft.world.GameRules
import net.minecraft.world.explosion.Explosion.DestructionType


class creep_frame(settings: Settings?) : Block(settings) {

}

class creep_frame_item(block: Block?, settings: Settings?) : BlockItem(block, settings){

}

class creeper_frame_reg {
    companion object {

        val block = creep_frame(FabricBlockSettings.of(Material.METAL))
        val item = creep_frame_item(block, FabricItemSettings())
    }
}