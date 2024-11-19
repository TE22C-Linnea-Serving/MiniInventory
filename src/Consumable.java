public class Consumable extends Item {
    public int usesMax;
    public int usesCurrent = 0;

    //Constructor
    public Consumable(String name, int usesMax) {
        this.name = name;
        this.usesMax = usesMax;
    }

    //Method
    public void use(Character target) {
        if (usesCurrent < usesMax) {
            System.out.println(target.name + " use " + this.name + "!");
            target.HP += 10;
            usesCurrent++;
        } else {
            System.out.println("That item is already used!");
        }
    }
}
