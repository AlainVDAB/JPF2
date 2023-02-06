package be.vdab;

import java.time.LocalTime;

public class Klok implements Runnable{
    @Override
    public void run() {
        var verderDoen = true;
        while (verderDoen) {
            System.out.println(LocalTime.now());
            if (Thread.interrupted()) {
                verderDoen = false; // klok stopzetten
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                verderDoen = false;
// Het uitvoeren van de sleep method kan een
// InterruptedException werpen.
// Je ziet hierover meer later in de cursus
                //System.err.println(ex);
            }
        }
    }
}
