public class DataReturnProxy implements IDataReturn
{
    private DataReturn _datareturn;
    private final String playerdata;

    public DataReturnProxy(String playerdata)
    {
        this.playerdata = playerdata;
    }

    @Override
    public void displayData()
    {
        if(_datareturn == null)
        {
            _datareturn = new DataReturn(playerdata);
        }
        else
        {
            System.out.println("Extracted from cache");
        }
        _datareturn.displayData();
    }
}
