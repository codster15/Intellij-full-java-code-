

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class collectionClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
            al.add(101);
            al.add(105);
            al.add(108);
            al.add(103);
            al.add(102);




        System.out.println(al);
        Collections.sort(al);
        System.out.println("=======================");
        System.out.println(al);

        Collections.reverse(al);
        System.out.println("=======================");
        System.out.println(al);











//approach 1
//        for (Object obj : al){
//            System.out.println(obj);
//        }

//approach 2
//        for (int i = 0; i < al.size() ; i++) {
//            System.out.println(al.get(i));
//        }
//

//approach 3
//        Iterator<Integer> ite = al.iterator();
//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        }


//approach 4
//        ListIterator<Integer> li = al.listIterator();
//        while(li.hasNext()){
//            System.out.println(li.next());
//        }




    }
}
