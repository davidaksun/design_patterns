package strategy;

/**
 * Created by davidaksun on 15.06.2015.
 */
public class TestStrategy {
    public static void main(String[] args){
        Apartment apartment1 = new Apartment();
        Villa villa1 = new Villa();

        System.out.println(apartment1.getBalcony());
        System.out.println(villa1.getBalcony());
    }
}
