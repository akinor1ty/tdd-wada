package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Franc extends Money {

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
