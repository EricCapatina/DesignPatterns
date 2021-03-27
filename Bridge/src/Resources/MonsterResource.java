package Resources;

public class MonsterResource implements IResource {

    public String Stats;
    public String Drop;
    public String Spoil;

    public MonsterResource(String stats, String drop, String spoil) {
        Stats = stats;
        Drop = drop;
        Spoil = spoil;
    }

    @Override
    public String GetStats() {
        return Stats;
    }
    @Override
    public String GetDrop() {
        return Drop;
    }

    @Override
    public String GetSpoil() {
        return Spoil;
    }


}
