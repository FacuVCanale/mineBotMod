package net.facuvc.test.controller;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.phys.Vec3;

public class PlayerController {

    static LocalPlayer player = Minecraft.getInstance().player;

    public static void moveForward() {
        // Apply impulse like normal input
        player.setDeltaMovement(0, 0, 0.98f);
    }

    public static void aiStep() {
        player.aiStep();
    }

}
