

public class temp<t1 ,t2> {
    t1 obj1;
    t2 obj2;

    temp(t1 obj1 , t2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    void print (){
        System.out.println(obj1 + " , " + obj2);

    }

    public static void main(String[] args) {
            temp <Integer , String> t = new temp<>(34 , "hello every one");
            t.print();

        System.out.println("------------------     Method 1 ----------------------");


        temp < String , Integer> t1 = new temp<>( "hello every one" , 34344);
        t1.print();

        System.out.println("------------------     Method 1 ----------------------");


        temp < String , Boolean> t2 = new temp<>( "hello every one" , false);
        t2.print();
    }




}
