package com.demo;

public class user {

    public void calculator(int... a){
        int sum = 0;
        for (int x : a){
            sum += x;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        user u = new user();
        u.calculator(10,20);
        u.calculator(10,20,30);
        u.calculator(10,20,50,60);

//        int a[] = {2,4,6,1,7};
//
//
//        for(int x : a){
//            System.out.println(x);
//
//        }




    }
}

