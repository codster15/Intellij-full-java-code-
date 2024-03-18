
//Approach 3

package java8features.lamda;

public class ThredDemo3UsingLambda {

    public static void main(String[] args) {


        Runnable r = () ->{
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(i);
            }
        };

        Thread th = new Thread(r);
        th.start();
    }
}

