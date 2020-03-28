package Instruments;

public class Trumpet extends Instrument {

    //Instance var

    private int valves;
    private String mouthpeice;

    //constructor
    public Trumpet(String type, double unitcost, double rrp, String sound, int valves, String mouthpeice) {
        super(type, unitcost, rrp, sound);
        this.valves = valves;
        this.mouthpeice = mouthpeice;
    }
    //getters


    public int getValves() {
        return valves;
    }

    public String getMouthpeice() {
        return mouthpeice;
    }
}

