package java8features.lamda;
//Approach 2
public class ThredDemo2 {


    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
            }


        };




        Thread th = new Thread(r);
        th.start();
    }
}
