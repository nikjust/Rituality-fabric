package net.fabricmc.example.items

import net.fabricmc.api.ModInitializer
import net.fabricmc.example.ModMain
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

open class ItemRegister() {
    init {
        println("Lol")
    }
    fun OnInit(){
        println("Items Register in progress")
        Registry.register(Registry.ITEM, Identifier("rituality", "tasty_item"), tasty_item.tastyItem)
        println("Items Register complete")

        println("lol")
    }

}