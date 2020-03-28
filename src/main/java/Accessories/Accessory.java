package Accessories;

public abstract class Accessory {

    private double unitcost;
    private double rrp;

    public Accessory(double unitcost, double rrp){
        this.unitcost = unitcost;
        this.rrp = rrp;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public double getRrp() {
        return rrp;
    }
}
