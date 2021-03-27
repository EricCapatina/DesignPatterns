public class PlayerCheckStatsAdapter implements IPlayerCheckStats {
    IPlayerCheckStatsAdvanced _playerAdvancedCheck;

    public PlayerCheckStatsAdapter(String player_race) {
        if(player_race.equalsIgnoreCase("Elf"))
        {
            _playerAdvancedCheck = new ElfCheck();
        }
        else if(player_race.equalsIgnoreCase("Gnome"))
        {
            _playerAdvancedCheck = new GnomeCheck();
        }
    }

    @Override
    public void check(String player_race) {
        if(player_race.equalsIgnoreCase("Elf"))
        {
            _playerAdvancedCheck.checkElf(player_race);
        }
        else if(player_race.equalsIgnoreCase("Gnome"))
        {
            _playerAdvancedCheck.checkGnome(player_race);
        }
    }
}
