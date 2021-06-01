public class ConcreteServer extends Server
{
    public ConcreteServer(IServerMediator mediator, String sid)
    {
        super(mediator, sid);
    }

    @Override
    public void sendCommandAll(String command)
    {
        _servermediator.sendCommandToServers(command, this);
    }

    @Override
    public void sendCommandToServer(String command, String toServer)
    {
        _servermediator.sendCommandToServer(command, this, toServer);
    }

    @Override
    public void readCommand(String command, String who)
    {
        System.out.println(this.serverid + " received command => " + command + " / from " + who );
    }
}
