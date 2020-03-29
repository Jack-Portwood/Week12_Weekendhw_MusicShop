package Accessories;

import Behaviours.ISell;

public class BowWax implements ISell {

    private String brand;
    private double unitcost;
    private double rrp;

    public BowWax(String brand, double unitcost, double rrp){
        this.brand = brand;
        this.unitcost = unitcost;
        this.rrp = rrp;
    }
//Getters
    public String getBrand() {
        return brand;
    }

    public double getUnitCost() {
        return unitcost;
    }

    public double getRRP() {
        return rrp;
    }

    //Methods

    public double calMarkup() {
        return this.rrp - this.unitcost;
    }

}
