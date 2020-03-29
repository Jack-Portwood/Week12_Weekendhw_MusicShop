package InstrumentsTests;

import Instruments.Cello;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {

    Cello cello;

    @Before
    public void before(){
        cello = new Cello( "String",300.00, 400.00,
                "weighty, dark, powerful", "Cello",4, "Bow");

    }

    @Test
    public void getType(){
        assertEquals( "String", cello.getType());
    }

    @Test
    public void getUnitCost(){
        assertEquals(300.00, cello.getUnitCost(), 0.001);
    }

    @Test
    public void getRRP(){
        assertEquals(400.00, cello.getRRP(), 0.001 );
    }

    @Test
    public void getStrings(){
        assertEquals(4, cello.getStrings());
    }

    @Test
    public void GetBow(){
        assertEquals("Bow", cello.getBow());
    }

    @Test public void instPlayed(){
        assertEquals("weighty, dark, powerful", cello.instPlayed());
    }

    @Test public void getName(){
        assertEquals("Cello", cello.getName());
    }

    @Test public void getMarkup(){
        assertEquals( 100.00, cello.calMarkup(), 0.01);
    }


}


