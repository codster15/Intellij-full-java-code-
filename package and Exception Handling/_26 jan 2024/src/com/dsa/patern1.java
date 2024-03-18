package com.dsa;

public class patern1 {
//
//    public static void print1(int n
//        // Write your code here
//
//        for(int i = 0; i < n ; i++){
//            for(int j = 0; j < i+1  ; j++){
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//        }
//    }

//    public static void nForest(int n) {
//
//        // Write your code here
//        for(int i = 0 ; i < n ;i++){
//            for(int j = 0 ; j < n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }

//    public static void nTriangle(int n) {
//        // Write your code here
//        for(int i = 0; i < n ; i++){
//            for(int j = 1; j < i+2  ; j++){
//                System.out.print(j+ " ");
//
//            }
//
//            System.out.println();
//        }
//    }

//    public static void nTriangle(int n) {
//        // Write your code here
//        for(int i = 0; i < n ; i++){
//            for(int j = 0; j < i+1  ; j++){
//                System.out.print( i+1 +" ");
//
//            }
//
//            System.out.println();
//        }



public static void nForest(int n) {

    // Write your code here
    for(int i = 0; i < n ; i++){
        for(int j = 0; j < n-i ; j++){
            System.out.print("* ");

        }

        System.out.println();
    }
}
    public static void main(String[] args) {
        nForest(3);
    }
}
