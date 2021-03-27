package Final;

public class FinalVersionV2 extends FinalVersion {
    public FinalVersionV2(){
        setPrice(10000);
        setDeadline("10.02.2021");
    }
    @Override
    public void sell() {
        System.out.println("Sold with VIP privileges");
    }
}
