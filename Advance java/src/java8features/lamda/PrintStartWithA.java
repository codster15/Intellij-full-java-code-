package java8features.lamda;

import java.util.function.Predicate;

public class PrintStartWithA {
    public static void main(String[] args) {
        String[] names = {"Anushka","Anupama","Deepika" , "Kajol" , "Sunny", "ananya"};
//
//        for(String x : names) {
//            char c = x.charAt(0);
//            if (c == 'a' || c == 'A') {
//                System.out.println(x);
//            }
//
//
//        }
        
        
        // using Lambda 
        
          Predicate<String> p = name -> name .charAt(0) == 'A';
            for(String name : names){

                if(p.test(name)){
                    System.out.println(name);
                }
            }
    }
}
