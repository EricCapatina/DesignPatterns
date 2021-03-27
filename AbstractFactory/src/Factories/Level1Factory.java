package Factories;

import Final.FinalVersion;
import Final.FinalVersionV1;
import demo.DemoV1;
import demo.DemoVersion;

public class Level1Factory implements TypeProduct {
    @Override
    public DemoVersion CreateDemo() {
        return new DemoV1();
    }

    @Override
    public FinalVersion CreateFinalV() {
        return new FinalVersionV1();
    }
}
