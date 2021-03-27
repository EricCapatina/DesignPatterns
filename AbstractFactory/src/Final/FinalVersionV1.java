package Final;

public class FinalVersionV1 extends FinalVersion{
    @Override
    public void setPrice(int price) {
        super.setPrice(12000);
    }

    @Override
    public void setDeadline(String deadline) {
        super.setDeadline("21.12.2022");
    }

    @Override
    public void sell() {
        System.out.println("Sold without VIP privileges");
    }
}
