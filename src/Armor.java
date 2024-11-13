import java.util.Scanner;

public class Armor extends Item {
    public String name;
    public float protection;
    Scanner scan = new Scanner(System.in);

    public Armor(String name, float protection) {
        this.name = name;
        this.protection = protection;
    }

    Armor helmet = new Armor("Helmet", 3);      //No??

    public void pickUpArmor() {     //No??
        System.out.println("Do you want to pick up: " + helmet.name + ", protection: " + helmet.protection + "?");


    }
}
