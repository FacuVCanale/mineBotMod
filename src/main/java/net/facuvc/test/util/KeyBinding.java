package net.facuvc.test.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.util.Lazy;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY= "key.categories.misc";

    public static final String KEY_TEST = "key.testmod.test1";


    public static final KeyMapping EXAMPLE_MAPPING = new KeyMapping(
        KEY_TEST, // Will be localized using this translation key
        KeyConflictContext.IN_GAME, // Conflict context tells forge when to trigger the event
        InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
        GLFW.GLFW_KEY_J, // Default key is J
        KEY_CATEGORY // Mapping will be in the misc category
    );
}
