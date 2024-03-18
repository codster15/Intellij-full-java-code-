package fileHandlingAll;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) throws IOException {
        FileReader  fr = new FileReader("z.txt");
        int a = fr.read();



        while(a != -1){  // condition to read all character from the file

            System.out.print((char) a); // here i am doing type casting
            a = fr.read();

        }
        fr.close(); // to close the connection btw java to file



    }
}
