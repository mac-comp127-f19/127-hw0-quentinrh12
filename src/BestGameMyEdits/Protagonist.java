package BestGameMyEdits;

import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;

import java.awt.*;

public class Protagonist extends GraphicsGroup{

    private Rectangle body = new Rectangle(0, 0, 200, 200);
    private Rectangle leftArm = new Rectangle(-150, 0, 150, 50);
    private Rectangle rightArm = new Rectangle(200, 0, 150, 50);
    private Rectangle leftLeg = new Rectangle(0, 200, 50, 150);
    private Rectangle rightLeg = new Rectangle(150, 200, 50, 150);

    public Protagonist() {
        body.setFillColor(Color.BLACK);
        leftArm.setFillColor(Color.BLACK);
        rightArm.setFillColor(Color.BLACK);
        leftLeg.setFillColor(Color.BLACK);
        rightLeg.setFillColor(Color.BLACK);
        super.add(body);
        super.add(leftArm);
        super.add(rightArm);
        super.add(leftLeg);
        super.add(rightLeg);
    }

}
