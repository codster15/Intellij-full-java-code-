
// print Armstrong number 1 to 1000
public class armStrongNumbers {
    public static void main(String[] args) {

        int number = 1;

        int cal = 0;

        while(number < 1000){
            int no = number;

            while(no > 0){
              int rem = no % 10;
                cal += rem * rem * rem;
               no = no/10;

            }
            if(number == cal){
                System.out.println("Armstrong Number - "+ cal);

            }

            cal = 0;
            number++;

        }

    }
}
