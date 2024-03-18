package fileHandlingAll.jan28_2024;

import java.io.PrintWriter;

public class printwriter {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.print("hello");
        pw.flush();
        pw.close();
    }
}
