import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        items.add(new Weapon("Axe", 5, 10));
        items.add(new Consumable("Beginner Potion", 3, 0));
    }

    public void display() {
        System.out.println("These items are currently in the backpack:");
        for (Item item : items) {
            System.out.println(item.name);
        }
    }

    public void addItem(Item item) {            //No?
        items.add(item);
    }
}
