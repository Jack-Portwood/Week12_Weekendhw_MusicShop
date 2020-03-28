package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {
//Inst variables
    private String type;
    private double unitcost;
    private double rrp;
    private String sound;

    //constructor

    public Instrument(String type, double unitcost, double rrp, String sound){
        this.type = type;
        this.unitcost = unitcost;
        this.rrp = rrp;
        this.sound = sound;
    }
//Getters

    public String getType(){
        return type;
    }

    public double getUnitCost(){
        return unitcost;
    }

    public double getRRP(){
        return rrp;
    }

    public String instPlayed(){
        return sound;
    }

}
