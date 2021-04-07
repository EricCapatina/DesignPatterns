public class DataReturn implements IDataReturn
{
    private String playerdata;

    public DataReturn(String playerdata)
    {
        this.playerdata = playerdata;
    }

    @Override
    public void displayData()
    {
        System.out.println("Displaying: " + playerdata + " data");
    }

    private void loadFromDB(String playerdata)
    {
        System.out.println("Loading " + playerdata + " Data");
    }
}
