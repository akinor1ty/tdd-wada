package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public abstract class Money {
    protected int amount;

    public Money() {

    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    abstract String currency();

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

}
