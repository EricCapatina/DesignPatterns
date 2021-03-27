public abstract class Bildek {
    buiolder Buiolder;

    void createSite()
    {
        Buiolder = new buiolder();
    }
    abstract void buildName();
    abstract void buildPrice();

    buiolder getBuiolder()
    {
        return Buiolder;
    }
}
