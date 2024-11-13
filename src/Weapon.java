import java.util.Random;

public class Weapon extends Item {
    public int minDamage;
    public int maxDamage;
    private Random generator = new Random();

    public Weapon(int InMinDamage, int inMaxDamage) {
        minDamage = InMinDamage;
        maxDamage = inMaxDamage;
    }

    public int attack() {
        int attack;
        attack = generator.nextInt(minDamage, maxDamage + 1);
        return attack;
    }
}
