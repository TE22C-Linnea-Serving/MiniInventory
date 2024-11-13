public class Consumable extends Item {
    public String name;
    public int usesMax;
    public int usesCurrent;

    //Constructor
    public Consumable(String name, int usesMax, int usesCurrent) {
        this.name = name;
        this.usesMax = usesMax;
        this.usesCurrent = usesCurrent;
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
