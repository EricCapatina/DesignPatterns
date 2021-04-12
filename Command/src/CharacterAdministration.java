public class CharacterAdministration
{
    private Command _spawnNPCCommand;
    private Command _deleteNPCCommand;
    private Command _teleportPCCommand;
    private Command _levelUpPCCommand;

    public CharacterAdministration(Command SpawnNPCCommand, Command DeleteNPCCommand, Command TeleportPCCommand,
    Command LevelUpPCCommand)
    {
        _spawnNPCCommand = SpawnNPCCommand;
        _deleteNPCCommand = DeleteNPCCommand;
        _teleportPCCommand = TeleportPCCommand;
        _levelUpPCCommand = LevelUpPCCommand;
    }

    public void spawn()
    {
        _spawnNPCCommand.Execute();
    }

    public void delete()
    {
        _deleteNPCCommand.Execute();
    }

    public void teleport()
    {
        _teleportPCCommand.Execute();
    }

    public void levelUp()
    {
        _levelUpPCCommand.Execute();
    }
}
