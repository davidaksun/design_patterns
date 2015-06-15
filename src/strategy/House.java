package strategy;

/**
 * Created by davidaksun on 15.06.2015.
 */
abstract public class House {
    protected double size;
    protected double price;
    protected Balcony balcony;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBalcony() {
        return this.balcony.open();
    }

    public void setBalcony(Balcony balcony) {
        this.balcony = balcony;
    }
}
