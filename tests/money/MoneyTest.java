package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by fujiwaraakinori on 2017/10/28.
 */
class MoneyTest {
    @Test
    public void testMultiplication() {
        Doller five = new Doller(5);
        Doller product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

}