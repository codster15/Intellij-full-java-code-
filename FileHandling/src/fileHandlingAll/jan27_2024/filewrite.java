package fileHandlingAll;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("java.txt");
        fw.write("hi every one");



//important
        fw.write("\n"); // \n will change the line
        fw.write("\t"); // \t will give tab space
        fw.write("\s");  // \s will give just space
//-------------------------------------------------------------
        fw.write("how are you");
        fw.flush();
        fw.close();
    }
}
