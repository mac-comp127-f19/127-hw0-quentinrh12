package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die dieone = new Die();
        for (int i = 0; i < 10; i++) {
            dieone.roll();
            System.out.println("Roll " + (i + 1) + " generated a " + dieone);
        }


        Die dietwo = new Die();
        int counter = 0;
        for (int j = 0; j < 1000000; j++) {
            dieone.roll();
            dietwo.roll();
            if (dieone.getValue() == dietwo.getValue()) {
                counter = counter+1;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + counter + " times");

    }
}
