package net.fabricmc.example.items

import net.fabricmc.example.overlay.iqOverlay
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World


public class item_tasty(settings: Settings?) : Item(settings) {
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        iqOverlay.renderer()
        println("food used")
        return super.use(world, user, hand)

    }
    }

class tasty_item {

    // an instance of our new item
    companion object {
        val foodcom = (FoodComponent.Builder().hunger(2).alwaysEdible().saturationModifier(0.1f)).snack().build()
        val tastyItem = item_tasty(FabricItemSettings().group(ItemGroup.FOOD).food(foodcom))
    }

}