package Java8PartTwo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadDataFromFIle {

    public static void main(String[] args) throws IOException {
        //FileReader file = new FileReader("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\java 1.8\\src\\Java8PartTwo\\testingFIle.txt");


        try(Stream<String> line = Files.lines(Paths.get("H:\\FULL STACK DEVELOPER\\Backend Part\\intelli Code upload\\java 1.8\\src\\Java8PartTwo\\testingFIle.txt"))){

//            line.forEach(l->{
//                if(l.startsWith("h")){
//                    System.out.println(l);
//                }
//            } );

            line.filter(l-> l.startsWith("h")).forEach(l-> System.out.println(l));
            


        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
