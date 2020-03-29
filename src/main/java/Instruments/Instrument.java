package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell{
//Inst variables
    private String type;
    private double unitcost;
    private double rrp;
    private String sound;
    private String name;

    //constructor

    public Instrument(String type, double unitcost, double rrp, String sound, String name){
        this.type = type;
        this.unitcost = unitcost;
        this.rrp = rrp;
        this.sound = sound;
        this.name = name;
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


    public String getName() {
        return name;
    }

    //methods

    public String instPlayed(){
        return sound;
    }



    public double calMarkup() {
        return this.rrp - this.unitcost;
    }

}
