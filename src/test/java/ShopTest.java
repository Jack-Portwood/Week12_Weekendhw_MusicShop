import Accessories.Metronome;
import Instruments.Oboe;
import Instruments.Trumpet;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Metronome metronome;
    Trumpet trumpet;
    Oboe oboe;

    @Before
    public void before(){
        shop = new Shop ("Quentin Cirda's Musical Emporium" );
        metronome = new Metronome( "Beat Freak", 20.00, 50.00);
        trumpet = new Trumpet("Brass",200.00, 300.00, "Toot toot",
                "Trumpet",3,"Bach K351 Mega Tone");
        oboe = new Oboe ("Wood Wind",150.00, 200.00,
                "Penetrating,acerbic,rasping, insistent.", "Oboe",45, "Reed");


    }

    @Test
    public void getName(){
        assertEquals( "Quentin Cirda's Musical Emporium", shop.getName());
    }

    @Test
    public void canAddStock(){
        shop.addStock(metronome);
        shop.addStock(trumpet);
        shop.addStock(oboe);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){

        shop.addStock(metronome);
        shop.addStock(trumpet);
        shop.addStock(oboe);
        shop.removeStock(metronome);
        assertEquals(2, shop.getStockCount());
    }


}
