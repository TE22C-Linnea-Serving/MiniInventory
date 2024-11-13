import java.util.Scanner;

public class Armor extends Item {
    public float protection;
    public String name;
    Scanner scan = new Scanner(System.in);

    public Armor(float inProtection, String InName) {
        protection = inProtection;
        name = InName;
    }

    Armor helmet = new Armor(4, "Helmet");

    public void pickUpArmor() {
        System.out.println("Do you want to pick up: " + helmet.name + ", protection: " + helmet.protection + "?");


    }
}
