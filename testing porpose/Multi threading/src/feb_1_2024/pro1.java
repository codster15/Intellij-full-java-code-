package feb_1_2024;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pro1 implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("from callable Method");
        return null;
    }

    public static void main(String[] args) {
        pro1 p = new pro1();
        ExecutorService es = Executors.newFixedThreadPool(5);

        for (int i = 0; i <10 ; i++) {
            es.submit(p);
        }


    }
}
