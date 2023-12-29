package net.facuvc.test.util;

import net.minecraft.client.player.Input;

public class CustomInput extends Input {

    int option;

    public CustomInput(int option) {
        super();
        this.option = option;
    }

    @Override
    public void tick(boolean p_44448_, float f) {
        this.leftImpulse = 0.0F;
        this.forwardImpulse = 0.0F;
        this.jumping = false;

        if (option == 1) {
            moveForward();
        }
        if (option == 2) {
            moveBackward();
        }
        if (option == 3) {
            moveLeft();
        }
        if (option == 4) {
            moveRight();
        }
    }

    public void moveForward() {
        this.forwardImpulse++;
    }

    public void moveBackward() {
        this.forwardImpulse--;
    }

    public void moveLeft() {
        this.leftImpulse++;
    }

    public void moveRight() {
        this.leftImpulse--;
    }


}
