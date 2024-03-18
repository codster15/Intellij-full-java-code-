package com.Deepak;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streampro {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<>();

        al.add(12);
        al.add(22);
        al.add(2);
        al.add(32);
        al.add(52);

     al.stream().filter(i-> i < 20).forEach(i-> System.out.println(i));



    }
}
