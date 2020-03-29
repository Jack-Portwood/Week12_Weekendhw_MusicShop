package InstrumentsTests;

import Instruments.Oboe;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet( "Brass",200.00, 300.00, "Toot toot",
                "Trumpet",3,"Bach K351 Mega Tone");

    }

    @Test
    public void getType(){
        assertEquals( "Brass", trumpet.getType());
    }

    @Test
    public void getUnitCost(){
        assertEquals(200.00, trumpet.getUnitCost(), 0.001);
    }

    @Test
    public void getRRP(){
        assertEquals(300.00, trumpet.getRRP(), 0.001 );
    }

    @Test
    public void getValves(){
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void getMouthPeice(){
        assertEquals("Bach K351 Mega Tone", trumpet.getMouthpeice());
    }

    @Test public void instPlayed(){
        assertEquals("Toot toot", trumpet.instPlayed());
    }

    @Test public void getName(){
        assertEquals("Trumpet", trumpet.getName());
    }

    @Test public void getMarkup(){
        assertEquals( 100.00, trumpet.calMarkup(), 0.01);
    }
}
