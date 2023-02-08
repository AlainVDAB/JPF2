package be.vdab.hfdst24;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var groentenPerLengte =
                Stream.of("sla", "kool", "wortel", "biet")
                        .collect(Collectors.groupingBy(
                                groente -> groente.length()));
        groentenPerLengte.entrySet().stream()
                .forEach(entry -> {
                    System.out.print(entry.getKey()+ " ");
                    entry.getValue().stream()
                            .forEach(groente -> System.out.print(groente+" "));
                    System.out.println();
                });
    }
}