

// print the multiples of 6 between 50 100
public class multipleOf6 {
    public static void main(String[] args) {

        int no  = 50;

        while(no <= 100){

            if(no % 6 == 0){
                System.out.println("Multiple of 6 - " + no);
            }
            no++;

        }
    }
}
