package be.vdab.hfdst24.oef;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ArtiestenEnHunAlbums {
    private static final Path PATH = Path.of("/data/albumsartists.txt");

    public static void main(String[] args) {
        try (var stream = Files.lines(PATH)) {
            stream.collect(Collectors.groupingBy(artiest -> artiest.substring(artiest.indexOf(",") + 1)))
                    .entrySet().stream()
                    .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                    .forEach(entry -> {
                        System.out.println("***" + entry.getKey() + "***");
                        entry.getValue().stream()
                                .sorted()
                                .map(album -> album.substring(0, album.indexOf(",")))
                                .forEach(album -> System.out.println("- " + album));
                        System.out.println("\n");

                    });


        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

}
