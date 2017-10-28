package money;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
public class Doller {

    int amount;

    public Doller(int amount) {
        this.amount = amount;

    }

    void times(int mutiplier) {
        amount = this.amount * 2;
    }


}
