package Accessories;

public class BowWax extends Accessory {

    private String brand;

    public BowWax(double unitcost, double rrp, String brand ){
        super(unitcost, rrp);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
