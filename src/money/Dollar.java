package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Dollar extends Money {

    private String currency;

    public Dollar(int amount) {
        this.amount = amount;

        currency = "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
