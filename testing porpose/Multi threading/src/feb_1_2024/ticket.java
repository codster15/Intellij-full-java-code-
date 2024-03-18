package feb_1_2024;

public class ticket implements Runnable{

    public synchronized  void m1(){

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " => " + i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    @Override

    public void run() {
      m1();
    }

    public static void main(String[] args) {
        ticket tck = new ticket();
        Thread t1 = new Thread(tck);
        t1.start();


        Thread t2 = new Thread(tck);
        t2.start();


        Thread t3 = new Thread(tck);
        t3.start();


    }
}
