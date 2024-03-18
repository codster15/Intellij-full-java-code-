import java.util.Scanner;

public class sumOfGivenNumber {

    static void sum(int n){
        int sum = 0;

        while(n > 0 ){

            sum = sum + n;

            n--;
        }
        System.out.println("sum of Number - "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();

        sum(value);
    }
}
