package fileHandlingAll;

import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        File f = new File("deepakSingh.txt"); //  new file will create --> deepak.txt
        boolean checkfstatus = f.createNewFile(); // this line will create the new file
        System.out.println(checkfstatus); // it will return the boolean status file created or not
        //-------------------------------------------------------------------------------------------------

        File f1 = new File("java.txt"); //  new file will create --> java.txt
        boolean checkf1status = f1.createNewFile(); // this line will create the new file
        System.out.println(checkfstatus); // it will return the boolean status file created or not
        //---------------------------------------------------------------------------------------


        File f2 = new File("My work Station");
        boolean check3 = f2.mkdir();
        System.out.println(check3);


// here creating directry
        File f4 = new File("data");
        f4.mkdir();


// here storing (test.txt) file in --> (data) directory
        File f5 = new File(f4 ,"test.txt");
        f5.createNewFile();

    }
}
