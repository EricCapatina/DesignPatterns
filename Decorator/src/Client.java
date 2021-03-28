public class Client {
    public static void main(String[] args) {
        IBuff buff = new MainStats();
        buff = new SpeedBuffDecorator(new PhysicalDmgDecorator(buff));

        System.out.println(buff.getBuff());
    }
}
