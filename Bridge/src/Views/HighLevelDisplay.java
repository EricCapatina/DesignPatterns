package Views;

import Resources.IResource;

public class HighLevelDisplay extends DisplayInformation {
    @Override
    public String Display() {
        String text;

        System.out.println("Spoil skill >7 level. Considered HighLevel");
        text = "\t\tStats: \n" + resource.GetStats() + "\n\t\tAdvanced Drop: \n" + resource.GetSpoil()
                + "\n\t\tDrop: \n" + resource.GetDrop();
        return text;
    }
}
