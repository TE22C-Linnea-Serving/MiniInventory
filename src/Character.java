public class Character {
    public int HP;
    public String name;
    public Inventory backpack;

    public Character(int inHP, String inName) {
        HP = inHP;
        name = inName;
        backpack = new Inventory();


    }

}
