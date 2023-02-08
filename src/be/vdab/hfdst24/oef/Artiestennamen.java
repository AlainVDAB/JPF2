package be.vdab.hfdst24.oef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Artiestennamen {
    private static final Path PATH = Path.of("/data/landcodes.txt");
    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream
                    .map(lijn-> lijn.substring(3))
                    .distinct()
                    .sorted()
                    .forEach(regel -> System.out.println(regel));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

}
