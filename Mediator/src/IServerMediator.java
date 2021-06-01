public interface IServerMediator
{
    void sendCommandToServers(String command, Server who);
    void sendCommandToServer(String command, Server who, String toServer);
}
