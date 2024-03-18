package co.pro.programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int read = sc.nextInt();
        Factorial f = new Factorial();
        f.facto(read);
    }

    void facto(int n ){
        int no = n;



      while(n >= 1){

          n--;

          if(n == 0){
              break;
          }
          no = no*n;

      }

        System.out.println(no);

    }



}
