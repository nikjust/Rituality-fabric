package net.fabricmc.example

import net.fabricmc.api.ModInitializer
import net.fabricmc.example.effect.EffectRegister
import net.fabricmc.example.items.ItemRegister
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

public class ModMain : ModInitializer {
    override fun onInitialize() {println("Hello Fabric world!")}
    fun init() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution
        val ir = ItemRegister()
        ir.OnInit()
        var fr = EffectRegister()
        fr.OnInit()
        onInitialize()
    }
}