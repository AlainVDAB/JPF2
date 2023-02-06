package be.vdab.hfdst24;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .forEach(getal->System.out.println(getal));
        IntStream.range(1, 10)
                .forEach(getal->System.out.println(getal));
    }
}