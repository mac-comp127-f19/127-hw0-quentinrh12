package activityStarterCode.objects;

import java.util.Random;

public class Die {
    private int faceValue;
    private final int max = 6;

    public void roll() {
        Random random = new Random();
        faceValue  = random.nextInt(6) + 1;
    }

    public int getValue() {
        if (faceValue >= 1 && faceValue <=6)
            return faceValue;
        else
            return -1;
    }

    public String toString() {
        switch (faceValue) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
        }
        return "Dice has yet to be rolled.";
    }
}
