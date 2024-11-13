import java.util.Scanner;

public class Character {
    public int HP;
    public String name;
    public Inventory backpack;

    public Character() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        backpack = new Inventory();


    }

}
