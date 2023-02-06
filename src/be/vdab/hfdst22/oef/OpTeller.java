package be.vdab.hfdst22.oef;

import java.lang.reflect.Array;

public class OpTeller implements Runnable {
    private  int startIndex;
    private int eindIndex;

    private double[] lijst;

    private double gemiddelde;


    public OpTeller(int startIndex, int eindIndex, double[] lijst) {
        this.startIndex = startIndex;
        this.eindIndex = eindIndex;
        this.lijst=lijst;

    }

    @Override
    public void run(){
        var totaal = 0;
        for (var i = startIndex; i<eindIndex;i++){
             totaal+= lijst[i];

        }
        totaal=totaal/(eindIndex-startIndex);

    };

    public double getGemiddelde() {
        return gemiddelde;
    }
}
