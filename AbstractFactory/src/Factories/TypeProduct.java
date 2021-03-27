package Factories;

import Final.FinalVersion;
import demo.DemoVersion;

public interface TypeProduct {
    DemoVersion CreateDemo();
    FinalVersion CreateFinalV();
}
