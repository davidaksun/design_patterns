package strategy;

/**
 * Created by davidaksun on 15.06.2015.
 */
public class Apartment extends House {
    public Apartment() {
        super();
        this.balcony = new ClosedBalcony();
    }

}
