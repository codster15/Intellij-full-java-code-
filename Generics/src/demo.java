


public class demo<t>{

    t obj;
        void m1 (t obj){
            this.obj = obj;
        }
        t pass(){
           return obj;
        }



    public static void main(String[] args) {
//        demo<Integer> d = new demo<>();
//        d.m1(23 );
//        System.out.println(d.pass());

        demo<String> d1 = new demo<>();
       d1.m1("hello every one");
        System.out.println(d1.pass());
    }


}
