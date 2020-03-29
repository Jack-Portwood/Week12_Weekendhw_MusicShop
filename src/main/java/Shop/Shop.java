package Shop;

//import Accessories.Accessory;
import Behaviours.ISell;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name){
        this.stock = new ArrayList<ISell>();
        this.name = name;
    }
//getters

    public String getName() {
        return name;
    }
//methods

    public void addStock(ISell isell){
        this.stock.add(isell);
    }

    public void removeStock(ISell isell){
        this.stock.remove(isell);
    }

    public int getStockCount(){
        return this.stock.size();
    }







//    public double calMarkup() {
//         return this.rrp - this.unitcost;
}



