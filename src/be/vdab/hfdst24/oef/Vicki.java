package be.vdab.hfdst24.oef;

import java.nio.file.Files;
import java.nio.file.Path;

public class Vicki {
    private static final Path PATH = Path.of("/data/acteurs-actrices.csv");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)){
            System.out.println(
                    stream.map(lijn->lijn.substring(0,lijn.indexOf(";")))
                            //.forEach(voornaam->System.out.println(voornaam));
                            .anyMatch(voornaam->voornaam.equals("Vicki"))
                            );




        }
        catch(java.io.IOException ex){
            ex.printStackTrace(System.err);
        }
    }
}
