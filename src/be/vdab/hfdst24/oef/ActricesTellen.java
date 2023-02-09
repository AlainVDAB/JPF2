package be.vdab.hfdst24.oef;

import java.nio.file.Files;
import java.nio.file.Path;

public class ActricesTellen {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            System.out.println(
            stream.map(lijn->lijn.substring(lijn.lastIndexOf(";")+1))
                    .filter(geslacht->geslacht.equals("F"))
                    .count());

        }
        catch(java.io.IOException ex){
            ex.printStackTrace(System.err);
        }
    }
}
