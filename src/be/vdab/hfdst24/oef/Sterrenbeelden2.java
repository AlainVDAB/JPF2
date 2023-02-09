package be.vdab.hfdst24.oef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sterrenbeelden2 {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream
                    .map(String::toUpperCase)
                    .forEach(System.out::println);

        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
