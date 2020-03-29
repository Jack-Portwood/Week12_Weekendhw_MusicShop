package AccessoriesTest;

import Accessories.Metronome;
import Accessories.ValveOil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetronomeTest {

    Metronome metronome;

    @Before
    public void before() {
        metronome = new Metronome("Beat Freak", 20.00, 50.00);

    }

    @Test
    public void getVolume() {
        assertEquals("Beat Freak", metronome.getModel());
    }

    @Test
    public void getUnitCost(){
        assertEquals(20.00, metronome.getUnitCost(),0.01);
    }

    @Test
    public void getRRP(){
        assertEquals(50.00, metronome.getRRP(), 0.01);
    }

    @Test
    public void getcalMarkup(){
        assertEquals(30.00, metronome.calMarkup(), 0.01);
    }
}
