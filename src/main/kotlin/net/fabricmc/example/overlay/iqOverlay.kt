package net.fabricmc.example.overlay

import kotlinx.coroutines.channels.ticker
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.START_CLIENT_TICK
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.START_WORLD_TICK
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.fabric.api.event.client.ClientTickCallback
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents
import net.fabricmc.fabric.api.event.world.WorldTickCallback
import net.minecraft.client.MinecraftClient
import net.minecraft.client.font.TextRenderer
import net.minecraft.client.render.item.ItemRenderer
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.world.World
import kotlin.math.min


class iqOverlay {


    companion object {
        private val minecraft: MinecraftClient? = null
        private val visible = false
        //private val fontRenderer: TextRenderer? = null
        private val itemRenderer: ItemRenderer? = null

        fun renderer() {
            for (i in 1..100) {
                val f : Float;
                if (i < 50){
                    f = i.toFloat()
                } else {
                    f = 100f - i.toFloat()
                }

                renderit(i.toFloat(),f)
            }
        }

        fun renderit(x:Float,y:Float){
        HudRenderCallback.EVENT.register(HudRenderCallback { matrices: MatrixStack?, tickDelta: Float ->
            MinecraftClient.getInstance().inGameHud.clear()
            MinecraftClient.getInstance().inGameHud.fontRenderer.draw(matrices, "Inteligence +1", x, y,0xBEF574)

                //fontRenderer!!.draw(matrices, "hello world!", 960f, 540f, 0)
        })

            //fontRenderer!!.draw(MatrixStack(), "hello world!", 960f, 540f, 0)

        }

    }
}