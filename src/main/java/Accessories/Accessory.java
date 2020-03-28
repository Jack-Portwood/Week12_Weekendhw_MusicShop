package Accessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private double unitcost;
    private double rrp;

    public Accessory(String name, double unitcost, double rrp){
        this.name = name;
        this.unitcost = unitcost;
        this.rrp = rrp;
    }

    public String getName() {
        return name;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public double getRrp() {
        return rrp;
    }
}
