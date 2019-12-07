package activityStarterCode.extractInterface;

import java.util.Random;

public class GameCharacter {
    private final String name;
    private int hitPoints, mana;
    private final Weapon attackType;

    public GameCharacter(String name, int hitPoints, int mana, Weapon attackType) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.attackType = attackType;
    }

    public String attack(GameCharacter target) {
         return attackType.weapon(this, target);
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}
