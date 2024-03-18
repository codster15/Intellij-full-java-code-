
package java8features.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPRo {
    public static void main(String[] args) {
            List<String> names = Arrays.asList("john" ,"Anushka" , "Robert" ,"Anupama" , "Smith" , "Ashok" );

        names.stream().filter(i -> i.charAt(0) == 'A').forEach(i -> System.out.println(i));


    }
}
