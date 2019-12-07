package activityStarterCode.extractInterface;

import java.util.Random;

public class Sword implements Weapon {
    private static final Random rand = new Random();

    private final int swordMaxDamage;
    private final int swordMinDamage;


    public Sword (int swordMaxDamage, int swordMinDamage) {
        this.swordMaxDamage = swordMaxDamage;
        this.swordMinDamage = swordMinDamage;
    }

    public String weapon(GameCharacter attacker, GameCharacter target) {
            int damage = rand.nextInt(swordMaxDamage - swordMinDamage + 1) + swordMinDamage;
            target.takeDamage(damage);
            return attacker.getName() + " struck " + target.getName() + " with a sword for "
                    + damage + " points of damage";
    }
}
