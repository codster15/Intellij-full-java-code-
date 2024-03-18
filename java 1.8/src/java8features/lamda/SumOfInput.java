

package java8features.lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class SumOfInput {

    public static void main(String[] args) {
               BiFunction<Integer ,Integer,Integer>  biFUn = (a , b) -> a + b;


        Integer sum = biFUn.apply(10, 20);
        System.out.println(sum);
    }

}
