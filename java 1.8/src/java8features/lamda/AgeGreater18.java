package java8features.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AgeGreater18 {
    String name ;
    int age ;
    AgeGreater18 (String name ,  int age){
        this.name = name;
        this.age = age;


    }



    public static void main(String[] args) {

        AgeGreater18 ag1 = new AgeGreater18("john" , 21);
        AgeGreater18 ag2 = new AgeGreater18("Smith" , 31);
        AgeGreater18 ag3 = new AgeGreater18("jack" , 11);
        AgeGreater18 ag4 = new AgeGreater18("warren" , 15);
        AgeGreater18 ag5 = new AgeGreater18("steph" , 9);

       // BiPredicate<String , Integer > ps =

        ArrayList<AgeGreater18> al = new ArrayList();
        al.add(ag1);
        al.add(ag2);
        al.add(ag3);
        al.add(ag4);
        al.add(ag5);


//        for (AgeGreater18 a : al){
//
//            if (a.age >= 18){
//                System.out.print(a.name +"\t" );
//                System.out.println(a.age);
//            }
//        }

        Predicate<AgeGreater18> bip = a -> a.age >= 18;

        for (AgeGreater18 print : al){
            if(bip.test(print)){
                System.out.print(print.name +"\t" );
                System.out.println(print.age);
            }
        }

    }
}

