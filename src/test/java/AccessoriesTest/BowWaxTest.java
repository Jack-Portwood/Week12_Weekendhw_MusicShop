package AccessoriesTest;

import Accessories.BowWax;
import Accessories.Metronome;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowWaxTest {

    BowWax bowwax;

    @Before
    public void before() {
        bowwax= new BowWax("Beez Best", 10.00, 20.00);

    }

    @Test
    public void getVolume() {
        assertEquals("Beez Best", bowwax.getBrand());
    }

    @Test
    public void getUnitCost(){
        assertEquals(10.00, bowwax.getUnitCost(),0.01);
    }

    @Test
    public void getRRP(){
        assertEquals(20.00, bowwax.getRRP(), 0.01);
    }

    @Test
    public void getcalMarkup(){
        assertEquals(10.00, bowwax.calMarkup(), 0.01);
    }
}
