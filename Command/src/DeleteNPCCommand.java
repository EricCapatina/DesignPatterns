public class DeleteNPCCommand extends Command
{
    private NonPlayerCharacter _npc;

    public DeleteNPCCommand(NonPlayerCharacter _npc) {
        this._npc = _npc;
    }

    @Override
    public void Execute() {
        _npc.delete();
    }
}
