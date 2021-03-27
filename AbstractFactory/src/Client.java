import Factories.Level1Factory;
import Factories.Level2Factory;
import Factories.TypeProduct;
import Final.FinalVersion;
import Final.FinalVersionV1;
import demo.DemoV1;
import demo.DemoVersion;

public class Client {
    public static void main(String[] args) {
        TypeProduct product = new Level2Factory();
        DemoVersion demo = product.CreateDemo();
        FinalVersion finalVersion = product.CreateFinalV();

        demo.sell();
        finalVersion.sell();
    }
}
