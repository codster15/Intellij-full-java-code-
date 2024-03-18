

package Collections;

import jdbcTesting.Studentclass;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOnUserDefinedObj {
    public static void main(String[] args) {

        ArrayList<Studentclass> al = new ArrayList<>();
        al.add(new Studentclass(101,"john" ,5));
        al.add(new Studentclass(104,"animal" ,2));
        al.add(new Studentclass(108,"cantom" ,9));
        al.add(new Studentclass(102,"dev" ,4));
        al.add(new Studentclass(103,"zel" ,1));

        Collections.sort(al);
        for(Studentclass a : al){
            System.out.println(a);
        }


    }
}
