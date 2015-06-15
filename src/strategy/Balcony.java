package strategy;
/**
 * Created by davidaksun on 15.06.2015.
 */
public interface Balcony {
    public String open();
}

class OpenBalcony implements Balcony{
    @Override
    public String open() {
        return "Open Balcony";
    }
}

class ClosedBalcony implements Balcony{
    @Override
    public String open() {
        return "Closed Balcony";
    }
}
