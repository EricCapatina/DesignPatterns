package Inventory;

public abstract class InventoryComponent
{
    public String Name;

    public String getName() {
        return Name;
    }

    public InventoryComponent(String name) {
        Name = name;
    }

    public abstract void Show(int level);
}
