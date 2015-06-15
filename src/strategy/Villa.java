package strategy;

/**
 * Created by davidaksun on 15.06.2015.
 */
public class Villa extends House{

    public Villa() {
        super();
        this.balcony = new OpenBalcony();
    }

}
