package com.Deepak;

import java.util.function.BiFunction;

public class BiFunctionPro {

    public static void main(String[] args) {
        BiFunction<Integer ,Integer,Integer> bi = (a,b) -> a+b;

        Integer i = bi.apply(10, 30);

        System.out.println(i);
    }



}
