package BestGameMyEdits;

import comp127graphics.Ellipse;

import java.awt.*;

public class Sidekick extends Ellipse {

    private double motionX = 0;
    private double motionY = 0;

    public Sidekick() {
        super(100, 0, 25, 25);
        super.setFillColor(Color.BLACK);
        super.setStrokeColor(Color.BLACK);
    }

    public void setMotionX(double motionX) {
        this.motionX = motionX;
    }

    public void setMotionY(double motionY) {
        this.motionY = motionY;
    }

    public double getMotionX() {
        return motionX;
    }

    public double getMotionY() {
        return motionY;
    }
}
