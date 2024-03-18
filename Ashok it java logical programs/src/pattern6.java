
//print the pattern below

//        1
//      1 2
//    1 2 3
//  1 2 3 4
//1 2 3 4 5


public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {

            // for space printing
            for (int j = 0; j < n-i ; j++) {
                System.out.print("  ");
            }

            //for number printing
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
;
    }
}
