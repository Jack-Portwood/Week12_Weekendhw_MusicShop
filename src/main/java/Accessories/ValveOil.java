package Accessories;

public class ValveOil extends Accessory {

    private String volume ;

    public ValveOil(String name, double unitcost, double rrp, String volume ){
        super(name,unitcost, rrp);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }
}
