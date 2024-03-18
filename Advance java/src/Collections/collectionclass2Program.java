

package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionclass2Program {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("about");
        al.add("come");
        al.add("zomato");

        System.out.println(al);
        System.out.println("===========");
        Collections.sort(al);
        System.out.println(al);
    }
}
