public class person {
    String name ;
    int age ;
    public person(String name , int age){
        this.name = name ;
        this.age  = age ;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
           person p = new person("jhon" , 26);


    }
}
 