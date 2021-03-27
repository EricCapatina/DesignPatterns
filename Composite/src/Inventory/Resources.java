package Inventory;

public class Resources extends InventoryComponent
{
    public Resources(String name) {
        super(name);
    }

    @Override
    public void Show(int level) {
        String space = " ".repeat(level);
        System.out.println(space + " " + Name);
    }
}
