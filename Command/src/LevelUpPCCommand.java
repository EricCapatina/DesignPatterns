public class LevelUpPCCommand extends Command{
    private PlayerCharacter _pc;

    public LevelUpPCCommand(PlayerCharacter _pc) {
        this._pc = _pc;
    }

    @Override
    public void Execute() {
        _pc.levelUp();
    }
}
