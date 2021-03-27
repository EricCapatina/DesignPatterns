public class buiolder {
    private String name;
    private int Price;



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "buiolder{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
