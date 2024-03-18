package date31jan_2024;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class pro1 implements Callable {

    public Object call() {
        System.out.println("run() - executed");


        return "hi";
    }

    public static void main(String[] args) {
        pro1 p = new pro1();
        ExecutorService es = Executors.newFixedThreadPool(5);


        for (int i = 0; i <=30 ; i++) {
            es.submit(p);

        }
        es.shutdown();

    }
}