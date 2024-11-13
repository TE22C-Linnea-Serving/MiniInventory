public class Consumable extends Item {
    public int usesMax;
    public int usesCurrent;

    public Consumable(int inUsesMax, int inUsesCurrent) {
        usesMax = inUsesMax;
        usesCurrent = inUsesCurrent;
    }

    public void use(Character target) {
        if (usesCurrent < usesMax) {
            target.HP += 10;
            System.out.println("You are now using this item!");
            usesCurrent++;
        } else {
            System.out.println("That item is already used!");
        }
    }
}
