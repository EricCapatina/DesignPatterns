public class Client
{
    public static void main(String[] args)
    {
        ServerMediator serverPanel = new ServerMediator();

        ConcreteServer testServer = new ConcreteServer(serverPanel, "Administrator");
        ConcreteServer server1 = new ConcreteServer(serverPanel, "Kain");
        ConcreteServer server2 = new ConcreteServer(serverPanel, "Teon");
        ConcreteServer server3 = new ConcreteServer(serverPanel, "Kastien");

        serverPanel.addServer(testServer);
        serverPanel.addServer(server1);
        serverPanel.addServer(server2);
        serverPanel.addServer(server3);

        testServer.sendCommandAll("Respawn all monsters");
        testServer.sendCommandToServer("Ban user with id: 1", "Kain");
        testServer.sendCommandToServer("Remove delay from instance", "Teon");
    }
}
