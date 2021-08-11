package net.fabricmc.example.effect

import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.potion.Potion
import net.minecraft.potion.Potions
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

open class EffectRegister() {
    init {
        println("Lol")
    }
    fun OnInit(){
        Potions.AWKWARD
        println("effect Register in progress")
        Registry.register(Registry.STATUS_EFFECT, Identifier("rituality", "creeper_stab"), creeper_stabilize.stab)
        println("effect Register complete")

        println("lol")
    }

}