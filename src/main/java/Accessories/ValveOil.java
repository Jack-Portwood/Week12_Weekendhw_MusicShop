package Accessories;

import Behaviours.ISell;

public class ValveOil implements ISell {

    private String volume ;
    private double unitcost;
    private double rrp;

    public ValveOil(String volume, double unitcost, double rrp ){
        this.volume = volume;
        this.unitcost = unitcost;
        this.rrp = rrp;
    }
//getters
    public String getVolume() {
        return volume;
    }

    public double getUnitCost() {
        return unitcost;
    }

    public double getRRP() {
        return rrp;
    }

    //methods

    public double calMarkup() {
        return this.rrp - this.unitcost;
    }
}
