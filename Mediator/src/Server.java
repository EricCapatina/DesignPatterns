public abstract class Server
{
    protected IServerMediator _servermediator;
    public String serverid;

    public Server(IServerMediator mediator, String sid)
    {
        this._servermediator = mediator;
        serverid = sid;
    }

    public abstract void sendCommandAll(String command);
    public abstract void sendCommandToServer(String command, String toServer);
    public abstract void readCommand(String command, String who);
}
