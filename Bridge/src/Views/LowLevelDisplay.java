package Views;

public class LowLevelDisplay extends DisplayInformation {
    @Override
    public String Display() {
        String text;

        System.out.println("Spoil skill <3 level. Considered LowLevel");
        text = "\t\tDrop: \n" + resource.GetDrop();
        return text;
    }
}
