package demo;

public class DemoV2 extends DemoVersion {

    @Override
    public void setPrice(int price) {
        super.setPrice(1);
    }

    @Override
    public void sell() {
        System.out.println("Demo Version VIP");
    }
}
