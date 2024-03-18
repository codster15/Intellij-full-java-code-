package co.pro.programs;


public class factorial2ndWay {
    public static void main(String[] args) {

        int fac = 1;

        for (int i = 1; i <= 5 ; i++) {
            fac = fac * i;
        }
        System.out.println(fac);
    }
}
