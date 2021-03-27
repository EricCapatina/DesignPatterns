package Inventory;

public class Weapons extends InventoryComponent {
    public Weapons(String name) {
        super(name);
    }
    @Override
    public void Show(int level) {
        String space = " ".repeat(level);
        System.out.println(space + " " + Name);
    }
}
