package fileHandlingAll.jan28_2024;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printwriter2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("f1.txt");
        pw.print("hello every one");
        pw.close();
        pw.close();
    }
}
