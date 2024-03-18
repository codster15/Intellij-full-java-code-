

// print factorial of given number
public class FactorialOfNumber {

    static void Factorial(int no){
        int sum = 1;
        int givenNo = no;

        while(no > 0){

            sum = sum * no;

            no--;
        }
        System.out.println("factorial of " + givenNo + " is - " + sum );
    }

    public static void main(String[] args) {

        Factorial(7);
    }
}
