import java.util.Scanner;

public class InventoryMain {
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("It is time to create a character!");
        Character player = new Character();

        player.backpack.display();

        System.out.println("\n" + player.name + " found a helmet, do you want to pick it up?");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            player.backpack.items.add(new Armor("Beginner Helmet", 3));
            System.out.println(player.name + " have now picked up the helmet!");
        } else {
            System.out.println(player.name + " leaves the helmet...");
        }
        player.backpack.display();
        System.out.println("\n" + player.name + " continues walking");
        System.out.println("\n" + player.name + " found a chest!");
        System.out.println("Choose one of the following options:");
        System.out.println("\n1. Steel Sword\n2. Mysterious Soup\n3. Boots");
        int option = sc.nextInt();
        if (option == 1) {
            player.backpack.items.add(new Weapon("Steel Sword", 8, 18));
        } else if (option == 2) {
            player.backpack.items.add(new Consumable("Mysterious Soup", 10));
        } else if (option == 3) {
            player.backpack.items.add(new Armor("Boots", 3));
        } else {
            System.out.println("Invalid option!");
        }
        player.backpack.display();
    }
}