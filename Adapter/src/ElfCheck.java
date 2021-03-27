public class ElfCheck implements IPlayerCheckStatsAdvanced {
    @Override
    public void checkGnome(String race) {
    }

    @Override
    public void checkElf(String race) {
        System.out.println("Player race: " + race + "\n" + "Stats:\nName: Black Wolf Kirra\nHP: 1145.4\n" +
                "MP: 114.5\nLevel: 15");
    }
}
