


// print the reverse number of the given digits
public class ReverseGivenNumber {
    static void reversedigits(int n ){

      String Reverse = "";

        while(n > 0){


            int rem = n % 10;
            Reverse += rem;
            n = n / 10;


        }
        System.out.println("Reverse digits - " + Reverse);
    }

    public static void main(String[] args) {
        reversedigits(129);
    }
}
