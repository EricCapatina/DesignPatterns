package Views;

public class MediumLevelDisplay extends DisplayInformation {
    @Override
    public String Display() {
        String text;

        System.out.println("Spoil skill >3 and <7 level. Considered MediumLevel");

        text = "\t\tDrop: \n" + resource.GetDrop() + "\n\t\tAdvanced Drop: \n" + resource.GetSpoil();
        return text;
    }
}
