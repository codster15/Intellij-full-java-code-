package com.Deepak;

public class Printnum {
    public static void main(String[] args) {
        Runnable r = () ->{
            for (int i = 1; i <= 3 ; i++) {
                System.out.println(                                     i);
            }

        };

        Thread th1 = new Thread(r);
        Thread th2 = new Thread(r);
        Thread th3 = new Thread(r);
        Thread th4 = new Thread(r);
        Thread th5 = new Thread(r);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
