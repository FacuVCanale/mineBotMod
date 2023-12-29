package net.facuvc.test.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

public class PlayerDataGetter {
    LocalPlayer localPlayer;

    public PlayerDataGetter(Minecraft mc) {
        localPlayer = mc.player;
        if (localPlayer == null) {
            System.out.println("Player is null");
        }
        else {
            System.out.println(localPlayer.getName());

            System.out.println(localPlayer.getUUID());

            //Print XYZ in one line
            System.out.println("X: " + localPlayer.getX() + " / Y: " + localPlayer.getY() + " / Z: " + localPlayer.getZ());

            //Print Yaw and Pitch in one line
            System.out.println("Yaw: " + localPlayer.getYRot() + " / Pitch: " + localPlayer.getXRot());

            //Print Player Targeted Block

        }
    }

    public String getPlayerInfoMessage() {
        String message = "";
        if (localPlayer == null) {
            message = "Player is null";
        }
        else {
            message = localPlayer.getName() + "\n";

            message += localPlayer.getUUID() + "\n";

            //Print XYZ in one line
            message += "X: " + localPlayer.getX() + " / Y: " + localPlayer.getY() + " / Z: " + localPlayer.getZ() + "\n";

            //Print Yaw and Pitch in one line
            message += "Yaw: " + localPlayer.getYRot() + " / Pitch: " + localPlayer.getXRot() + "\n";
        }
        return message;
    }
}
