import Accessories.Metronome;
import Instruments.Trumpet;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Metronome metronome;
    Trumpet trumpet;

    @Before
    public void before(){
        shop = new Shop ("Music Shop" );
        metronome = new Metronome( "Beat Freak", 20.00, 50.00);
        trumpet = new Trumpet("Brass",200.00, 300.00, "Toot toot",
                "Trumpet",3,"Bach K351 Mega Tone");


    }

    @Test
    public void getName(){
        assertEquals( "Music Shop", shop.getName());
    }

    @Test
    public void canAddStock(){
        shop.addStock(metronome);
        assertEquals(1, shop.getStockCount());
    }

//    @Test
//    public void canAddStock() {
//        shop.addStock(trumpet);
//        assertEquals(1, shop.getStockCount());
//    }

//    @Test
//    public void canRemoveStock(){
//        shop.removeStock(metronome);
//        assertEquals(0, shop.getStockCount());
//    }

    @Test
    public void canRemoveStock(){
        shop.removeStock(trumpet);
        assertEquals(0, shop.getStockCount());
    }


}
