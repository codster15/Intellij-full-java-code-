//print this hell below

//             *
//          *  *  *
//       *  *  *  *  *
//    *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *
//    *  *  *  *  *  *  *
//       *  *  *  *  *
//          *  *  *
//             *

// finnally i did this

public class pattern7 {

    public static void main(String[] args) {

        int n = 5;
        int b = 5;
        for (int a = 0; a < 1 ; a++) {


            for (int i = 1; i <= n; i++) {

                //for space
                for (int j = 0; j < n - i; j++) {
                    System.out.print("   ");
                }

                //for star
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" * ");
                }
                //for space
                for (int j = 0; j < n - i; j++) {
                    System.out.print("   ");
                }
                System.out.println();


            }

            //bottom part---------------------------------
            for (int i = 1; i < b; i++) {

                //for space
                for (int j = 0; j < i; j++) {
                    System.out.print("   ");
                }

                //for star
                for (int j = 0; j < 2 * b - (2 * i + 1); j++) {
                    System.out.print(" * ");
                }
                //for space
                for (int j = 0; j < i; j++) {
                    System.out.print("   ");
                }
                System.out.println();
            }
        }

    }

}
