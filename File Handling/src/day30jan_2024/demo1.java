package day30jan_2024;

public class demo1 extends Thread {
    public void run(){
        System.out.println("hello form run()");


    }

    public static void main(String[] args) {
        System.out.println("main start");
        demo1 d = new demo1();
        Thread t = new Thread(d);
        t.start();
        System.out.println("Main ends here");
    }
}
