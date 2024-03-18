package com.demo;

public class wrapperclass {
    public static void main(String[] args) {
        int a = 10;

        Integer i = new Integer(a); // boxing // here we are converting primitive data type into object formate this process is called as wrapper class
        System.out.println(i);

        String c = "120";
        Integer q = new Integer(c); // boxing // here we are converting primitive data type into object formate this process is called as wrapper class
        System.out.println(q);
    }


}
