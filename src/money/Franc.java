package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;

    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
