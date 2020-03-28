package Accessories;

public class Metronome extends Accessory {

    private String model;

    public Metronome(String name, double unitcost, double rrp, String model ){
        super(name, unitcost, rrp);
        this.model = model;
    }

    public String getBrand() {
        return model;
    }

}
