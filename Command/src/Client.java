public class Client
{
    public static void main(String[] args)
    {
        // Problema:
        // Transforma solicitari in obiecte aparte, ne permite sa cream o clasa universala, care sa
        // apeleze comenzi asupra diferitor obiecte, decuplam module

        NonPlayerCharacter rikkus = new NonPlayerCharacter("Rikkus Lord of Fire", 33, 1);
        PlayerCharacter playerCharacter = new PlayerCharacter();
        // NPC
        Command spawnCommand = new SpawnNPCCommand(rikkus);
        Command deleteCommand = new DeleteNPCCommand(rikkus);
        // PC
        Command levelUpCommand = new LevelUpPCCommand(playerCharacter);
        Command teleportPCCommand = new TeleportPCCommand(playerCharacter);
        // Admin Panel
        CharacterAdministration panel = new CharacterAdministration(spawnCommand, deleteCommand,
                levelUpCommand, teleportPCCommand);
        // Execute
        panel.spawn();
        panel.delete();
        panel.teleport();
        panel.levelUp();
    }
}
