package be.vdab.hfdst24.oef;

import java.util.stream.Stream;
class Rechthoek{
    private int lengte;
    private  int breedte;
    public Rechthoek (int lengte, int breedte){
        this.lengte=lengte;
        this.breedte=breedte;
    }
}

public class KleinsteOppervlakte {


    public static void main(String[] args) {
        var rechthoeken = Stream.of(new Rechthoek(6,5),new Rechthoek(2,10),
                new Rechthoek(6,7),new Rechthoek(2,4),new Rechthoek(3,4));

    }
}
