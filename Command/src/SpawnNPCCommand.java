public class SpawnNPCCommand extends Command
{
    private NonPlayerCharacter _npc;

    public SpawnNPCCommand(NonPlayerCharacter _npc) {
        this._npc = _npc;
    }

    @Override
    public void Execute()
    {
        _npc.spawn();
    }
}
