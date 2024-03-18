import java.util.Scanner;

public class seasons {
    static void seasons(int n){

        if(n == 1){
            System.out.println("rainy");
        } else if (n ==2 ) {
            System.out.println("winter");
        } else if ( n == 3) {
            System.out.println("spring");
        } else if (n == 4) {
            System.out.println("Summer");

        }else {
            System.out.println("Incorrect Season Entered");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int read =  sc.nextInt();
        seasons(read);
    }
}
