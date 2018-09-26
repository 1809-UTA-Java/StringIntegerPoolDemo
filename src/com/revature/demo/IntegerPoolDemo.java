package com.revature.demo;

/**
 * Java also has a place in heap for small numbers between
 * -128 to 127
 */
public class IntegerPoolDemo {
    public static void main(String[] args) {
        Integer a100 = 100;
        Integer b100 = 100;
        Integer a1000 = 1000;
        Integer b1000 = 1000;

        System.out.println(a100 == b100);
        System.out.println(a100.equals(b100));
        System.out.println(a1000 == b1000);
        System.out.println(a1000.equals(b1000));
    }
}