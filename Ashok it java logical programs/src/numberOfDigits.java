


// calculate the total digits

public class numberOfDigits {

    static void digits(int n ){

        int count = 0;

        while(n > 0){

            count++;
            int rem = n % 10;
            n = n / 10;


        }
        System.out.println("total digits - " + count);
    }

    public static void main(String[] args) {
        digits(129);
    }
}
