package be.vdab.hfdst24.oef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Scanner;

public class Landcodes {
    private static Optional<String> landcodes(String code) {
        //public static void main(String[] args) {


        try {
            var reader = Files.newBufferedReader(Path.of("/data/landcodes.txt"));
            for (String regel; (regel = reader.readLine()) != null; ) {
                if (code.equals(regel.substring(0, 2))) {
                    return Optional.of(regel.substring(3));
                }
            }


        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return Optional.empty();

    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Geef een landcode op (typ \"stop\" om te stoppen)");
        var ingave = scanner.next();
        while (!ingave.equals("stop")) {
            landcodes(ingave).ifPresent(land -> System.out.println(land));
            System.out.println("Geef een landcode op (typ \"stop\" om te stoppen)");
            ingave = scanner.next();
        }


    }

}
