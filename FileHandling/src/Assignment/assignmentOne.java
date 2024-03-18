package Assignment;

import java.io.*;

//1 >  write a java program to find how many character, how many words and
// how many lines available in the file
public class assignmentOne {

    //  ----------------------------------------------------------------------------file created and data Inserted
    public static void createFile () throws IOException {
        FileWriter fr = new FileWriter("demoFile.txt");

        fr.write("A paragraph is a series of sentences that are organized and coherent, and are all related to a single topic. Almost every piece of writing you do that is longer than a few sentences should be organized into paragraphs. This is because paragraphs show a reader where the subdivisions of an essay begin and end, and thus help the reader see the organization of the essay and grasp its main points.");
        fr.flush();
        fr.close();
    }


    // ----------------------------------------------------------------------------character find
    public static void CharaterFind() throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        int a = fr.read();
        int count = 0;
        int TotalCharacter;

        while(a != -1){
            count++;

            a = fr.read();
        }
        TotalCharacter = count;
        System.out.println("Total Character in file are - " + TotalCharacter);

    }


    //  ---------------------------------------------------------------------------- to count words
    public static void wordCount () throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        int a = fr.read();
            int count = 0;

            while(a != -1){
                if(a == 32 ){
                    count++;
                }

                a = fr.read();
            }
            count++;
            int noOfWord = count;

        System.out.println("total number of words in the file is => " + noOfWord);


    }


//   ----------------------------------------------------------------------------TO count line
    public static void Line() throws IOException {
        FileReader fr = new FileReader("demoFile.txt");
        BufferedReader br = new BufferedReader(fr);
       String line = br.readLine();
       int count = 0;

       while(line != null){

           count++;
           line = br.readLine();

       }
        System.out.println();
        System.out.println("Total lines - " + count);



    }


    public static void main(String[] args) throws IOException {
             //createFile();
            // CharaterFind();
           // wordCount();
          //Line();





    }
}
