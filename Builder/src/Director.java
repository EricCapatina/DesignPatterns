public class Director {
    Bildek bildek;

    public void setBildek(Bildek bildek) {
        this.bildek = bildek;
    }

    buiolder buildBilder()
    {
        bildek.createSite();
        bildek.buildName();
        bildek.buildPrice();

        buiolder site = bildek.getBuiolder();

        return site;
    }
}
