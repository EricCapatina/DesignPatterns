package demo;

public class DemoV1 extends DemoVersion{
    @Override
    public void setPrice(int price) {
        super.setPrice(0);
    }

    @Override
    public void sell() {
        System.out.println("Demo Version Non-VIP");
    }
}
