package net.fabricmc.example.block

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

open class BlockRegister() {
    init {
        println("Lol")
    }

    fun OnInit() {
        println("Block Register in progress")
        Registry.register<Block, Block>(Registry.BLOCK, Identifier("rituality", "creep_frame"), creeper_frame.block)
        Registry.register<Item, Item>(Registry.ITEM, Identifier("rituality", "creep_frame"), creeper_frame.item)
        println("Block Register complete")

        println("lol")
    }

}