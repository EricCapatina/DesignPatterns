public class Server
{
    private String name;
    private String raidBossState;
    private int serverCurrency;

    public Server(String Name, String RaidBossState, int ServerCurrency) {
        this.name = Name;
        this.raidBossState = RaidBossState;
        this.serverCurrency = ServerCurrency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaidBossState() {
        return raidBossState;
    }

    public void setRaidBossState(String raidBossState) {
        this.raidBossState = raidBossState;
    }

    public int getServerCurrency() {
        return serverCurrency;
    }

    public void setServerCurrency(int serverCurrency) {
        this.serverCurrency = serverCurrency;
    }

    public ServerMemento saveState()
    {
        return new ServerMemento(name, raidBossState, serverCurrency);
    }

    public void getStateFromMemento(ServerMemento serverMemento)
    {
        this.name = serverMemento.getName();
        this.serverCurrency = serverMemento.getServerCurrency();
        this.raidBossState = serverMemento.getRaidBossState();
    }

    @Override
    public String toString()
    {
        return "Server:\nName:" + name + " Raid Boss State:" + raidBossState + " Server Currency: " + serverCurrency;
    }
}
