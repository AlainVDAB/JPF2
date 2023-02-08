package be.vdab.hfdst24.oef;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OnevenGetallen {

    public static void main(String[] args) {


        var getallen = new HashSet<Integer>();
        var scanner = new Scanner(System.in);
        System.out.println("Typ een getal (0 om te stoppen)");
        var getal = scanner.nextInt();

        while (getal!= 0){
            getallen.add(getal);
            System.out.println("Typ een getal (0 om te stoppen)");
            getal = scanner.nextInt();
        }

        getallen.stream()
                .filter(oneven -> oneven%2==1)
                .sorted((getal1,getal2)-> getal2-getal1)
                .forEach(onevenGetal -> System.out.println(onevenGetal));


    }
}
