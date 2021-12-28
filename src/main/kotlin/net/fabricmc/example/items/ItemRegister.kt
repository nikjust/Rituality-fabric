package net.fabricmc.example.items

import net.fabricmc.example.effect.creeper_stabilize
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.potion.Potion
import net.minecraft.potion.Potions
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

open class ItemRegister() {
    init {
        println("Lol")
    }

    fun OnInit() {
        println("Items Register in progress")
        Registry.register(Registry.ITEM, Identifier("rituality", "tasty_item"), tasty_item.tastyItem)
        Registry.register(Registry.ITEM, Identifier("rituality", "stable_creeper"), stable_creeper.stableCreeper)
        Registry.register(
            Registry.POTION,
            Identifier("rituality", "creeper_stabilize_potion"),
            Potion(*arrayOf(StatusEffectInstance(creeper_stabilize.stab, 40)))
        )
        println("Items Register complete")

        println("lol")
    }

}