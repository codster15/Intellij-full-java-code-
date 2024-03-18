package com.Deepak;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class loadFIle {
    static String filePath = "H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\REGISTRATION_AND_LOGIN_PROJECT\\Java8FeaturesPracticeSet\\src\\com\\Deepak\\test.txt";
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get(filePath));
        lines.forEach(line-> System.out.println(line));

    }

}
