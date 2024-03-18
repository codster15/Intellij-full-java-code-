import java.util.Scanner;

public class months {
    static void month(int n){

        if(n == 1){
            System.out.println("january");
        } else if (n ==2 ) {
            System.out.println("february");
        } else if ( n == 3) {
            System.out.println("March");
        } else if (n == 4) {
            System.out.println("April");
        } else if ( n == 5) {
            System.out.println("May");
        } else if (n == 6) {
            System.out.println("june");
        } else if (n == 7) {
            System.out.println("july");
        } if(n == 8){
            System.out.println("August");
        } else if (n == 9 ) {
            System.out.println("September");
        } else if ( n == 10) {
            System.out.println("October");
        } else if (n == 11) {
            System.out.println("November");
        } else if ( n == 12) {
            System.out.println("December");
        }
        else {
            System.out.println("Incorrect Month Entered");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int read =  sc.nextInt();
        month(read);
    }
}
