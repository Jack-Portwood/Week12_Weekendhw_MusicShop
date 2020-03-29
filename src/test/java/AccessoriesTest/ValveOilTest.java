package AccessoriesTest;

import Accessories.ValveOil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValveOilTest {

    ValveOil valveOil;

    @Before
    public void before() {
        valveOil = new ValveOil("150ml", 20.00, 50.00);

    }

    @Test
    public void getVolume() {
        assertEquals("150ml", valveOil.getVolume());
    }

    @Test
    public void getUnitCost(){
        assertEquals(20.00, valveOil.getUnitCost(),0.01);
    }

    @Test
    public void getRRP(){
        assertEquals(50.00, valveOil.getRRP(), 0.01);
    }

    @Test
    public void getcalMarkup(){
        assertEquals(30.00, valveOil.calMarkup(), 0.01);
    }

}





