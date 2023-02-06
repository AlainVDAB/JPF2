package be.vdab;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class IncestenLezerMain {
    public static void main(String[] args) {
        var start = LocalTime.now().getNano();
        var lezer1 = new InsectenLezer("/data/insecten1.csv"
                , System.out);
        var thread1 = new Thread(lezer1);
        var lezer2 = new InsectenLezer("/data/insecten2.csv"
                , System.err);
        var thread2 = new Thread(lezer2);
        thread1.start();

        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
// Het uitvoeren van de join method kan een InterruptedException werpen
// Je ziet hierover meer later in de cursus
            System.err.println(ex);
        }
        System.out.println(lezer1.getAantalRegels() + lezer2.getAantalRegels() + " regels");
        //System.out.println(LocalTime.now().getNano()-start);

    }
}
