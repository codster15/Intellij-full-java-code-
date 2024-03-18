package java8features.lamda;

import java.util.stream.Stream;

public class StreamPro2 {


public static void main(String[] args) {
    user u1 = new user("Anushka" ,25 );
    user u2 = new user("Smith" , 30);
    user u3 = new user("Raju" ,15 );
    user u4 = new user("Rani" , 10);
    user u5 = new user("Charles" ,35 );
    user u6 = new user("Ashok" , 30);


    Stream<user> stream = Stream.of(u1, u2, u3, u4, u5, u6);

    stream.filter(u -> u.age >= 18 && u.name.charAt(0) == 'A' ).forEach(u -> System.out.println(u));

    }
}


class user{
    String name ;
    int age ;

    user(String name ,int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "user [ name = " + name + " . age =  " + age + "]";

    }
}
