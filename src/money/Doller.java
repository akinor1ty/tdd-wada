package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Doller {

    int amount;

    public Doller(int amount) {
        this.amount = amount;

    }

    Doller times(int mutiplier) {
        return new Doller(amount * mutiplier);
    }

    public boolean equals(Object object) {
        return true;
    }


}
