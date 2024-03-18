package fileHandlingAll;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filefilter {
    public static void main(String[] args) throws IOException {
        File f = new File("I:\\testing");
        String []arr = f.list();

        for(String name: arr){
            File f1 = new File(f,name);  // (f,name); here f --> is the parent , and  (name) --> child which is content inside the parent
            if(f1.isFile()){
                System.out.println("File - "+ name);
            }if(f1.isDirectory()){
                System.out.println("Directory - "+ name);
            }
        }
    }
}
