package Factories;

import Final.FinalVersion;
import Final.FinalVersionV2;
import demo.DemoV2;
import demo.DemoVersion;

public class Level2Factory implements TypeProduct{

    @Override
    public DemoVersion CreateDemo() {
        return new DemoV2();
    }

    @Override
    public FinalVersion CreateFinalV() {
        return new FinalVersionV2();
    }
}
