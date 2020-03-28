package Accessories;

public class Metronome extends Accessory {

    private String model;

    public Metronome(double unitcost, double rrp, String model ){
        super(unitcost, rrp);
        this.model = model;
    }

    public String getBrand() {
        return model;
    }

}
