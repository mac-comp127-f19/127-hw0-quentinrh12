package activityStarterCode.extractInterface;

import java.util.Random;

public class Fireball implements Weapon {
    private final int fireballDamage;
    private final int fireballManaRequired;

    public Fireball (int fireballDamage, int fireballManaRequired) {
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String weapon(GameCharacter attacker, GameCharacter target) {
            if (attacker.useMana(fireballManaRequired)) {
                target.takeDamage(fireballDamage);
                return attacker.getName() + " hit " + target.getName() + " with a fireball for "
                        + fireballDamage + " points of damage";
            } else {
                return attacker.getName() + " did not have enough mana for a fireball attack";
            }
    }
}
