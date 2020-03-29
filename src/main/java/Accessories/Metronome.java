package Accessories;

import Behaviours.ISell;

public class Metronome implements ISell {

    private String model;
    private double unitcost;
    private double rrp;

    public Metronome(String model, double unitcost, double rrp){
        this.model = model;
        this.unitcost = unitcost;
        this.rrp = rrp;
    }
//getters
    public String getModel() {
        return model;
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
