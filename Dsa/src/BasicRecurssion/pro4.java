package BasicRecurssion;

import java.util.Scanner;

public class pro4 {

    public static int sum(int n){

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
     sum(3);
  
    }


}
