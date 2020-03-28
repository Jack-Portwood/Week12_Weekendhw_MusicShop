import Instruments.Cello;
import Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

    Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe( "Wood Wind",150.00, 200.00,
                "Penetrating,acerbic,rasping, insistent.", "Oboe",45, "Reed");

    }

    @Test
    public void getType(){
        assertEquals( "Wood Wind", oboe.getType());
    }

    @Test
    public void getUnitCost(){
        assertEquals(150.00, oboe.getUnitCost(), 0.001);
    }

    @Test
    public void getRRP(){
        assertEquals(200.00, oboe.getRRP(), 0.001 );
    }

    @Test
    public void getStrings(){
        assertEquals(45, oboe.getKeys());
    }

    @Test
    public void GetBow(){
        assertEquals("Reed", oboe.getReed());
    }

    @Test public void instPlayed(){
        assertEquals("Penetrating,acerbic,rasping, insistent.", oboe.instPlayed());
    }

    @Test public void getName(){
        assertEquals("Oboe", oboe.getName());
    }
}
