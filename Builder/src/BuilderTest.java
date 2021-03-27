public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBildek(new Enterprisebuilder());
        buiolder Buiolder = director.buildBilder();

        director.setBildek(new Togetherbuilder());
        buiolder Buiolder2 = director.buildBilder();

        director.setBildek(new Customerbuilder());
        buiolder Buiolder3 = director.buildBilder();



        System.out.println(Buiolder);
        System.out.println("===================");
        System.out.println(Buiolder2);
        System.out.println("===================");
        System.out.println(Buiolder3);


    }
}
