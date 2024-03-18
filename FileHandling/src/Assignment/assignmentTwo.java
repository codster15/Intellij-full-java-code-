package Assignment;

//program 2
//=======

//2 > write a java program to read 2 files data and
// write 2 files content into 3 rd file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class assignmentTwo {

    public static void main(String[] args) throws IOException {
        SecondProgram();
    }

    public static void SecondProgram() throws IOException {

        FileWriter fw1 = new FileWriter("file1.txt");
        fw1.write("Paragraphs are the building blocks of papers.\n Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a " +
                "page " +
                "long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph \n. A paragraph is defined as “a group of sentences or a single " +
                "sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether\n a section in a paper is a paragraph. For instance, in some styles of " +
                "writing, particularly journalistic styles, a paragraph \n can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In " +
                "this handout, we will refer to this as the “controlling idea,\n” because it controls what happens in the rest of the paragraph.");

        fw1.flush();
        fw1.close();



        FileWriter fw2 = new FileWriter("file2.txt");
        fw2.write("The final movement in paragraph development involves tying up the loose ends of the paragraph. \nAt this point, you can remind your reader about the relevance of the " +
                "information " +
                "to the larger paper, or you can make a concluding point for \n this example. You might, however, simply transition to the next paragraph.\n" +
                "\n");
        fw2.flush();
        fw2.close();

//        --------------------------------------  file combine    --------------------------
//file 1 read
        FileReader frReader1 = new FileReader("file1.txt");
        BufferedReader brOfFile1 = new BufferedReader(frReader1);
        String fileone = brOfFile1.readLine();
        String f1data = fileone;


        while(fileone != null){

            f1data += fileone;


            fileone = brOfFile1.readLine();


        }






//file 2 read
        FileReader frReader2 = new FileReader("file2.txt");
        BufferedReader brOfFile2 = new BufferedReader(frReader2);
        String fileTwo = brOfFile2.readLine();
        String f2data = fileTwo;

        while(fileTwo != null){

            f2data += fileTwo;
            fileTwo = brOfFile2.readLine();

        }




        System.out.println();


//file 1 added in combine
//        FileWriter fwCombine = new FileWriter("Combine.txt");
//            fwCombine.write(f1data);
//
//            fwCombine.write("\n");
//
//            fwCombine.write(f2data);
//            fwCombine.flush();

//reading data

       FileReader frCombine = new FileReader("Combine.txt");
       BufferedReader brCombine = new BufferedReader(frCombine);
       String Combine = brCombine.readLine();


       while(Combine != null){
           System.out.println(Combine);
           Combine = brCombine.readLine();

       }




    }
}
