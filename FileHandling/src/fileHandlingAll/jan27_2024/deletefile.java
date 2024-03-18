package fileHandlingAll;

import java.io.File;

public class deletefile {
    public static void main(String[] args) {
        File f = new File("deepakSingh.txt");
        boolean check = f.delete();
        System.out.println(check);
    }
}
