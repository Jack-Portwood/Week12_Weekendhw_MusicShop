package Instruments;

public class Oboe extends Instrument {

    //Instance var

    private int keys;
    private String reed;

    //constructor
    public Oboe (String type, double unitcost, double rrp, String sound, int keys, String reed){
        super(type, unitcost,rrp, sound);
        this.keys = keys;
        this.reed = reed;

    }

    public int getKeys() {
        return keys;
    }

    public String getReed() {
        return reed;
    }
}
