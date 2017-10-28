package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Money {
    protected int amount;

    public Money() {

    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

}
