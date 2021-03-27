package Inventory;
import java.util.ArrayList;
import java.util.List;

public class InventoryDisplay extends InventoryComponent {
    private List<InventoryComponent> maincomponent = new ArrayList<InventoryComponent>();

    public InventoryDisplay(String name) {
        super(name);
    }

    @Override
    public void Show(int level) {
        String space = " ".repeat(level);
        System.out.println(space + "- " + Name);
        for(InventoryComponent component : maincomponent)
        {
            component.Show(level + 1);
        }
    }
    //     [  12, 13 ,15 ]
    //     remove(13)

    public void GetItem(InventoryComponent component)
    {
        maincomponent.add(component);
    }
    public void DeleteItem(InventoryComponent component)
    {
        maincomponent.remove(component);
    }
}
