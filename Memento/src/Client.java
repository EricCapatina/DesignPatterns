public class Client
{
    public static void main(String[] args)
    {
        Server server = new Server("Kain", "Alive", 200);
        System.out.println(server);

        ServerMemento serverMemento = server.saveState();

        server.setServerCurrency(5000);
        server.setRaidBossState("Dead");
        System.out.println(server);

        server.getStateFromMemento(serverMemento);
        System.out.println(server);
    }
}
