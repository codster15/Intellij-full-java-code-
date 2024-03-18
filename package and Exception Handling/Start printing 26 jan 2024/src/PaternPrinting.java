public class PaternPrinting {

    public static void print1(int n) {

//* * *
//* * *
//* * *


        // Write your code here
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
//    -------------------------------------------------------------


    public static void print2(int n) {

//        *
//        * *
//        * * *
        // Write your code here

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i+1  ; j++){
                System.out.print("* ");

            }

            System.out.println();
        }
    }
    //    -------------------------------------------------------------


    public static void print3(int n) {
//        1
//        1 2
//        1 2 3

        // Write your code here
        for(int i = 0; i < n ; i++){
            for(int j = 1; j < i+2  ; j++){
                System.out.print(j+ " ");

            }

            System.out.println();
        }
    }
    //    -------------------------------------------------------------



    public static void print4(int n) {
//        1
//        2 2
//        3 3 3
        // Write your code here
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i+1  ; j++){
                System.out.print( i+1 +" ");

            }

            System.out.println();
        }
    }
    //    -------------------------------------------------------------

    public static void print5(int n) {
//        1 2 3
//        1 2
//        1
        // Write your code here
        for(int i = 0; i < n ; i++){
            for(int j = 1; j <= n-i  ; j++){
                System.out.print( j +" ");

            }

            System.out.println();
        }
    }
    //-------------------------------------------------------------------------


    public static void print6(int n) {
//                    *
//                   ***
//                  *****
//                 *******
//                *********
        // Write your code here
        for(int i = 0; i < n ; i++){


                //for space

                for (int space = 0; space < n-i-1 ; space++) {
                    System.out.print(" ");
                }

                //for star
                for (int star = 0; star < 2*i+1 ; star++) {
                    System.out.print("*");
                }


                //for space
                for (int space2 = 0; space2 < n-i-1 ; space2++) {
                    System.out.print(" ");
                }




            System.out.println();
        }
    }
    //------------------------------------------------------------------------------

    public static void print7(int n) {
//            *****
//             ***
//              *
        // Write your code here
        for(int i = 0; i < n ; i++){


            //for space
            for (int space = 0; space < i ; space++) {
                System.out.print(" ");
            }

            //for star
            for (int star = 0; star < 2*n-(2*i+1) ; star++) {
                System.out.print("*");
            }


            //for space
            for (int space2 = 0; space2 < i ; space2++) {
                System.out.print(" ");
            }


            System.out.println();
        }


    }
    //----------------------------------------------------------------------------------

//              *
//             ***
//            *****
//           *******
//          *********
//          *********
//           *******
//            *****
//            ***
//             *
    public static void print8(int n) {

        for (int a = 0; a < 1 ; a++) {

            for(int i = 0; i < n ; i++){


                //for space

                for (int space = 0; space < n-i-1 ; space++) {
                    System.out.print(" ");
                }

                //for star
                for (int star = 0; star < 2*i+1 ; star++) {
                    System.out.print("*");
                }


                //for space
                for (int space2 = 0; space2 < n-i-1 ; space2++) {
                    System.out.print(" ");
                }




                System.out.println();
            }


            //------------------------------------------------------------------
                        for(int i = 0; i < n ; i++){


                            //for space
                            for (int space = 0; space < i ; space++) {
                                System.out.print(" ");
                            }

                            //for star
                            for (int star = 0; star < 2*n-(2*i+1) ; star++) {
                                System.out.print("*");
                            }


                            //for space
                            for (int space2 = 0; space2 < i ; space2++) {
                                System.out.print(" ");
                            }


                            System.out.println();
                        }





        }

    }
//-----------------------------------------------------------------
//program
    //        *
    //        **
    //        ***
    //        ****
    //        *****
    //        ****
    //        ***
    //        **
    //        *

    public static void print9(int n){
        for (int i = 0; i <= 2*n -1 ; i++) {
            int star = i;

            if(i > n ){
                star = 2*n -i;          // very inteligent code
            }

            for (int j = 0; j < star ; j++) {
                System.out.print("*");


            }
            System.out.println();
        }

    }

    //----------------------------------------------------------------


    public static void print10(int n){
            int start = 1 ;
        for (int i = 0; i < n; i++) {
            if(i % 2== 0 ){
                start  = 1;

            }else{
                start = 0;

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

            //print1(3);
            //print2(3);
            //print3(3);
            //print4(3);
            //print5(3);
            //print6(5);
            //print7(1);
            //print8(5);
            //print9(5);
            print10(3);
    }

}
