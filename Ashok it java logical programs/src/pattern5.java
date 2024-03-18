

//print the below pattern
//IIIII
//  I
//  I
//  I
//IIIII
// now i'm gaining the confidence


public class pattern5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {

            for (int j = 1; j <=5 ; j++) {

                if(i == 1 || i ==5 ){
                    System.out.print("I");
                }else {
                    if(j == 3){
                        System.out.print("I");
                    }else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }

    }
}
