package be.vdab.hfdst24.oef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Sterrenbeelden {
    private static final Path PATH = Path.of("/data/sterrenbeelden.txt");
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var woord = scanner.next();
        try (var stream = Files.lines(PATH)) {
            stream
                    .filter(sterrenbeeld -> sterrenbeeld.toLowerCase().contains(woord.toLowerCase()))
                    .forEach(regel -> System.out.println(regel.toUpperCase()));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
