package be.vdab.hfdst24.oef;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Rechthoek{
    private int lengte;
    private  int breedte;
    public Rechthoek (int lengte, int breedte){
        this.lengte=lengte;
        this.breedte=breedte;
    }

    public int oppervlakte(){
        return lengte*breedte;
    }

    @Override
    public String toString() {
        return lengte + " op " + breedte;
    }
}

public class KleinsteOppervlakte {


    public static void main(String[] args) {
        var rechthoeken = List.of(new Rechthoek(4,2),new Rechthoek(2,10),
                new Rechthoek(6,7),new Rechthoek(2,4),new Rechthoek(3,4));
        var minimum = rechthoeken.stream()
                .mapToInt(rechthoek-> rechthoek.oppervlakte())
                .min();

        minimum.ifPresent(kleinste-> {
            System.out.println(kleinste);
            rechthoeken.stream()
                    .filter(rechthoek -> rechthoek.oppervlakte()==kleinste)
                    .forEach(kleinsterechthoek -> System.out.println(kleinsterechthoek));

        });





    }
}
