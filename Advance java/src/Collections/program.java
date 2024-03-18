


package Collections;

import java.util.ArrayList;
import java.util.List;

public class program {

    public static void main(String[] args) {

        List l =new ArrayList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);

        System.out.println(l);
        l.set(1,9000);
        System.out.println(l);

        System.out.println(l.contains(400));
     }

}
