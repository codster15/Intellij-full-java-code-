package feb_1_2024;

public class pro2 implements Runnable {

    @Override
    public void run() {
        System.out.println("test");
        if(Thread.currentThread().isDaemon()){
            System.out.println("deamon thread executed");
        }else{
            System.out.println("Normal thread executed");
        }

    }

    public static void main(String[] args) {
        pro2 p = new pro2();
        Thread th = new Thread(p);
        th.setDaemon(true);
        th.start();

    }
}
