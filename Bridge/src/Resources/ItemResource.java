package Resources;

public class ItemResource implements IResource{

    public String DropFromMonsters;
    public String SpoilFromMonsters;
    public String Stats;

    public ItemResource(String stats, String spoilFromMonsters, String dropFromMonsters) {
        DropFromMonsters = dropFromMonsters;
        SpoilFromMonsters = spoilFromMonsters;
        Stats = stats;
    }

    @Override
    public String GetStats() {
        return Stats;
    }
    @Override
    public String GetDrop() {
        return DropFromMonsters;
    }

    @Override
    public String GetSpoil() {
        return SpoilFromMonsters;
    }


}
