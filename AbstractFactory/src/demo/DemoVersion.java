package demo;

public abstract class DemoVersion {
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void sell();
}
