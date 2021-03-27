public class CheckStats implements IPlayerCheckStats {
    PlayerCheckStatsAdapter _check_adapter;

    @Override
    public void check(String race) {
        if(race.equalsIgnoreCase("Human")){
            System.out.println("Player race: " + race + "\n" + "HP: 1145.4\nLevel: 15");
        }
        else if(race.equalsIgnoreCase("Gnome") || race.equalsIgnoreCase("Elf"))
        {
            _check_adapter = new PlayerCheckStatsAdapter(race);
            _check_adapter.check(race);
        }
        else
        {
            System.out.println("<|Error|> Invalid player race");
        }
    }
}
