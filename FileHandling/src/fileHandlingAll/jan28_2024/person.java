package fileHandlingAll.jan28_2024;

import java.io.*;

public class person implements Serializable {
    int id ;
    String name;
    String gender;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        person p = new person();
        p.id = 43434;
        p.name = "linken";
        p.gender  = "male";

        System.out.println("=========  Serialization started   ===========");

        FileOutputStream fos = new FileOutputStream("dataStr.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.flush();
        oos.close();

        System.out.println("=========  Serialization Compeleted   ===========");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=========  De - Serialization started   ===========");

            FileInputStream fis = new FileInputStream("datastr.ser"); // here connecting to the file
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            person p1 = (person) obj;
        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p1.gender);
        ois.close();

        System.out.println("=========  De - Serialization Compeleted   ===========");
    }
}
