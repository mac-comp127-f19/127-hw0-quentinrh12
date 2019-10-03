package activityStarterCode.objects;

import java.util.Random;

public class DieAdvanced {
    private int faceValue;
    private int sides;

    public void setDie(int sides) {
        this.sides = sides;
    }

    public void roll() {
        Random random = new Random();
        faceValue  = random.nextInt(sides) + 1;
    }

    public int getValue() {
        if (faceValue == 0)
            return -1;
        else
            return faceValue;
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

