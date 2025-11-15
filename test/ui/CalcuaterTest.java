package ui;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcuaterTest {

    @Test
    public void testCalculateTotal() {
        Calcuater calc = new Calcuater();
        double total = calc.calculateTotal(5, 200.0); // 5 items × 200 each
        assertEquals(1000.0, total, 0.001);
    }

    @Test
    public void testCalculateDiscount() {
        Calcuater calc = new Calcuater();
        double discount = calc.calculateDiscount(1000.0, 10.0); // 10% discount
        assertEquals(100.0, discount, 0.001);
    }

    @Test
    public void testCalculateNetAmount() {
        Calcuater calc = new Calcuater();
        double net = calc.calculateNetAmount(1000.0, 100.0); // total 1000, discount 100
        assertEquals(900.0, net, 0.001);
    }
}
