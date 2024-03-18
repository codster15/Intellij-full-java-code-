package java8features.lamda;

//  Approach 1
public class PrintUsingThread implements Runnable {
    public static void main(String[] args) {


        PrintUsingThread pth = new PrintUsingThread();

        Thread th = new Thread(pth);
        th.start();

    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
