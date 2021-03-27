import Inventory.*;
public class Client {
    public static void main(String[] args) {
        // Problema:
        // Nevoie de a descrie grup de obiecte sub forma unui arbore
        // Tip: Type Safety / Uniform

//       [ LegionBlade, ElvenSword, DarkEBow ]

        Weapons LegionBlade = new Weapons("Legion Blade");
        Weapons ElvenSword = new Weapons("Elven Sword");
        Weapons DarkEBow = new Weapons("Dark Elven Bow");


        Resources RurriqVenom = new Resources("Rurriq Venom");
        Resources DemonHorn = new Resources("Demon Horn");

        InventoryDisplay Inventory = new InventoryDisplay("MainInventory:");
        InventoryDisplay Weapon = new InventoryDisplay("Weapons:");
        InventoryDisplay Resource = new InventoryDisplay("Resources:");

        Weapon.GetItem(LegionBlade);
        Weapon.GetItem(ElvenSword);
        Weapon.GetItem(DarkEBow);


        Resource.GetItem(RurriqVenom);
        Resource.GetItem(DemonHorn);

        Inventory.GetItem(Weapon);
        Inventory.GetItem(Resource);

        Inventory.Show(0);

        System.out.println("----============: With RemoveItem() Function :=============----");

        Weapon.DeleteItem(DarkEBow);

        Inventory.Show(0);
    }
}
