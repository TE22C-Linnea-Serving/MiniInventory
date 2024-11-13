import java.util.Random;

public class Weapon extends Item {
    public String name;
    public int minDamage;
    public int maxDamage;
    private Random generator = new Random();

    //Constructor
    public Weapon(String name, int minDamage, int maxDamage) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getNameWeapon() {
        return name;
    }

    public int attack() {
        Random gen = new Random();
        int damage = gen.nextInt(minDamage, maxDamage + 1);

        return damage;
    }
}
