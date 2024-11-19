import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        items.add(new Weapon("Axe", 5, 10));
        items.add(new Consumable("Beginner Potion", 3));
    }

    public void display() {
        System.out.println("\nThese items are currently in the backpack:");
        for (Item item : items) {
            System.out.println(item.name);
        }
    }
}
