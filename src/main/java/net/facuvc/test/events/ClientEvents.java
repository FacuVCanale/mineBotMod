package net.facuvc.test.events;

import net.facuvc.test.TestMod;
import net.facuvc.test.util.CustomInput;
import net.facuvc.test.util.KeyBinding;
import net.facuvc.test.util.PlayerDataGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = TestMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBinding.EXAMPLE_MAPPING.consumeClick()) {
                TestMod.isMoving = !TestMod.isMoving;
                Minecraft.getInstance().player.sendSystemMessage(
                        Component.literal(new PlayerDataGetter(Minecraft.getInstance()).getPlayerInfoMessage()));
            }
        }

        @SubscribeEvent
        public static void onClientTick(TickEvent.ClientTickEvent event) {
            if (event.phase == TickEvent.Phase.END && TestMod.isMoving) {
                Minecraft.getInstance().player.input = new CustomInput(1);
            }
        }

    }

    @Mod.EventBusSubscriber(modid = TestMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.EXAMPLE_MAPPING);
        }

    }

}
