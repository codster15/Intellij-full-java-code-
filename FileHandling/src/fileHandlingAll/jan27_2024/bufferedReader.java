package fileHandlingAll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("z.txt");
        BufferedReader br = new BufferedReader(fr); // to read line by line fileReader is required
        String a =  br.readLine();


        while (a != null){  // condition when readline will become null that means all the line got readed

            System.out.println(a);
            a = br.readLine();
        }


    }
}
