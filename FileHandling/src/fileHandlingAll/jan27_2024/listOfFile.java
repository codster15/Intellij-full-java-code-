package fileHandlingAll;

import java.io.File;

public class listOfFile {

    public static void main(String[] args) {
        File f = new File("H:\\FULL STACK DEVELOPER\\Backend Part\\Vs code upload\\Ashok Sir - Backend Development\\Core java\\Notes");

// beautiful program
        String [] arr = f.list();  // f.list(); --> this will store all the file in the (arr) of above path

        for(String name : arr){
            System.out.println(name);
        }
    }

}
