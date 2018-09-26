package com.revature.demo;

/**
 * String literals may have 0 or more characters
 * Strings are immutable, cannot be edited after creation
 * Stored in the String Pool, a collection in the heap
 * Compiler searches the pool and returns a string if one
 * already exists. 
 * (String).equals(anotherString) vs String1 == String2
 */
public class StringPoolDemo {
    public static void main(String[] args) {
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        
        String ex1 = "hello";
        String ex2 = new String("hello");
        System.out.println(ex1.equals(ex2));
        System.out.println(ex1 == ex2);

        //java.lang.StringBuilder
        //Mutable sequence of characters, not threadsafe
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        ex1 = sb.toString();
        System.out.print(ex1);

        //java.lang.StringBuffer, same but threadsafe (slower)

    }
}