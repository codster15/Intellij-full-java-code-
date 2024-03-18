//package java8features.lamda;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class CollectorProgram {
//    public static void main(String[] args) {
//            Person P1 = new Person("John" , "USA");
//            Person P2 = new Person("Steve" , "Japan");
//            Person P3 = new Person("Ashok" , "India");
//            Person P4 = new Person("Ching" , "China");
//            Person P5 = new Person("Kumar" , "India");
//
//
//        List<Person> person = Arrays.asList(P1,P2,P3,P4,P5 );
//
//        List<String> indian = person.stream()
//                .filter(p -> p.country.equals("India"))
//                .map(p -> p.name)
//                .collect(Collectors.toList());
//
//        indian.stream().forEach(p -> System.out.println(p));
//
//
//
//    }
//
//
//
//
//    }
//
//
//
//class Person{
//    String name;
//String country ;
//
//    Person(String name ,String country){
//        this.name = name;
//        this.country = country;
//
//    }
//
//    @Override
//    public String toString() {
//        return "name - "+ name +" Country - "+ country;
//    }
//}
