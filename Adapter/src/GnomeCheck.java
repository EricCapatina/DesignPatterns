public class GnomeCheck implements IPlayerCheckStatsAdvanced {

    @Override
    public void checkGnome(String race) {
        System.out.println("Player race: " + race + "\n" + "Stats:\nLevel: 15\nDrop:\nWeapons:\nSunshine Blade[1-2]\n" +
                "Resources:\nKirra's fang[2-6]");
    }

    @Override
    public void checkElf(String race) {
    }
}
