package Accessories;

public class ValveOil extends Accessory {

    private String volume ;

    public ValveOil(double unitcost, double rrp, String volume ){
        super(unitcost, rrp);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }
}
