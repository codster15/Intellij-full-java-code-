package java8features.lamda;

import java.util.ArrayList;
import java.util.Collections;

public class SortInDecendingOrder{


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(1);
        al.add(7);
        al.add(9);
        al.add(2);


            al.forEach(i -> System.out.print(i+ " "));

    }


}
