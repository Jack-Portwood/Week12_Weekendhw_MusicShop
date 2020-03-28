package Accessories;

public class BowWax extends Accessory {

    private String brand;

    public BowWax(String name, double unitcost, double rrp, String brand ){
        super(name,unitcost, rrp);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
