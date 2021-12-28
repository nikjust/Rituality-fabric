package net.fabricmc.example.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World


public class stable_creeper_instance(settings: Settings?) : Item(settings) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        println("food used")
        return super.use(world, user, hand)

    }
}

class stable_creeper {

    // an instance of our new item
    companion object {
        val stableCreeper = stable_creeper_instance(FabricItemSettings().group(ItemGroup.MISC))
    }

}