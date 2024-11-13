import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
        items.add(new Weapon(5, 10));
        items.add(new Consumable(3, 0));
    }

    public void display() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
