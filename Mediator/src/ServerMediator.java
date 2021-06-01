import java.util.ArrayList;

public class ServerMediator implements IServerMediator
{
    private ArrayList<ConcreteServer> _concreteServers;

    public ServerMediator()
    {
        _concreteServers = new ArrayList<ConcreteServer>();
    }


    public void addServer(ConcreteServer servers)
    {
        _concreteServers.add(servers);
    }

    @Override
    public void sendCommandToServers(String command, Server who)
    {
        for(ConcreteServer server : _concreteServers )
        {
            if(server != who)
            {
                server.readCommand(command, who.serverid);
            }
        }
    }

    @Override
    public void sendCommandToServer(String command, Server who, String toServer)
    {
        for(ConcreteServer server : _concreteServers)
        {
            if(server == null)
            {
                System.out.println("Server doesn't exist");
            }
            else
            {
                if(server.serverid.equals(toServer))
                {
                    server.readCommand(command, who.serverid);
                }
            }
        }
    }
}
