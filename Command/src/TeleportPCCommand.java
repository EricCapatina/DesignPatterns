public class TeleportPCCommand extends Command
{
    private PlayerCharacter _pc;

    public TeleportPCCommand(PlayerCharacter _pc) {
        this._pc = _pc;
    }

    @Override
    public void Execute() {
        _pc.teleport();
    }
}
