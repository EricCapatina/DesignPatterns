public class ServerMemento extends Server
{
    public ServerMemento(String Name, String RaidBossState, int ServerCurrency)
    {
        super(Name, RaidBossState, ServerCurrency);
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    @Override
    public String getRaidBossState()
    {
        return super.getRaidBossState();
    }

    @Override
    public int getServerCurrency()
    {
        return super.getServerCurrency();
    }
}
