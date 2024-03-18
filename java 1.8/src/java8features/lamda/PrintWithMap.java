


package java8features.lamda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PrintWithMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashok" , "Anil" , "Raju" , "Rani" ,"John" , "Akash" , "Charles");

       // names.stream().map(name -> name.startsWith("A")).forEach(name-> System.out.println(name ));

        names.stream().filter(name -> name.charAt(0) == 'A')
                //.mapToInt(name->name.length())
                .forEach(name-> System.out.println(name + "\t" + name.length() ));

    }
}
