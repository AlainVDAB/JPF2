package be.vdab.hfdst22.oef;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        var randomGetallen = new double[1000000];
        var random = new Random();
        for (var i =0; i < randomGetallen.length; i++){
            randomGetallen[i]= Math.abs(random.nextInt());
        }
        var som1 = new OpTeller(0,500000,randomGetallen);
        var som2 = new OpTeller(500000,1000000,randomGetallen);
        var thread1 = new Thread(som1);
        var thread2 = new Thread(som2);

        thread1.start();
        thread2.start() ;

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }

        var gemiddelde = (som1.getGemiddelde()+som2.getGemiddelde())/2;

        System.out.println(gemiddelde + " " + randomGetallen[555] + randomGetallen[865231]);






    }
}
