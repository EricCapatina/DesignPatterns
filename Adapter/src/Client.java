public class Client {
    public static void main(String[] args) {
        CheckStats checkStats = new CheckStats();

        checkStats.check("Elf");
        System.out.println("----==========================----");
        checkStats.check("Gnome");
        System.out.println("----==========================----");
        checkStats.check("Human");
    }
}
