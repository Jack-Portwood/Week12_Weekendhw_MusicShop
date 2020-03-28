package Instruments;

import Behaviours.IPlay;

public class Cello extends Instrument {

    private int strings;
    private String bow;

    public Cello(String type, double unitcost, double rrp, String sound, String name, int strings, String bow){
        super(type, unitcost,rrp,sound, name);
        this.strings = strings;
        this.bow = bow;
    }

    public int getStrings() {
        return strings;
    }

    public String getBow() {
        return bow;
    }


}
