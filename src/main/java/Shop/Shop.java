package Shop;

import Accessories.Accessory;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Accessory> accessories;
    private ArrayList<Instrument> instruments;
    private double till;
    private String name;

    public Shop(double till, String name){
        this.accessories = new ArrayList<Accessory>();
        this.instruments = new ArrayList<Instrument>();
        this.till = till;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
