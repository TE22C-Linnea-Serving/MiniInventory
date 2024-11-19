import java.util.Scanner;

public class Character {
    public int HP;
    public String name;
    public Inventory backpack;

    public Character() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to name the character?");
        name = sc.nextLine();
        backpack = new Inventory();


    }

}
