package Shop;

import Accessories.Accessory;
import Behaviours.ISell;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
//    private double till;
    private String name;

    public Shop(double till, String name){
        this.stock = new ArrayList<ISell>();
//        this.till = till;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
