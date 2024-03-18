package BasicRecurssion;

import java.util.Scanner;

public class pro5 {

    public int print(int n ){

        if(n == 1 ){
            return 1;
        }

        return  n * print(n-1);
    }


    public static void main(String[] args) {


        pro5 p = new pro5();
       int Factorial =  p.print(4 );

        System.out.println(Factorial);
    }
}
