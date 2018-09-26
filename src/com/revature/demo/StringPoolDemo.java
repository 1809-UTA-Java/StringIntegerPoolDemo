package com.revature.demo;

/**
*  
* comparing strings: <string>.equals(anotherString)
* whereas <string> == anotherString is comparing memory location
 */

 public class StringPoolDemo {

     public static void main(String args[]) {
        //strings are immutable but creating a string through a constructor
        // String helloString = new String(helloArray);
        // will ccreate a new string object in the string pool 

        //java.lang.StringBuilder
        //mutable sequence of characters, not threadsafe 

        //writing it this way means u don't have to import java.lang.StringBuilder
        //no real advantage to this just some java libraries r huge so might be easier 

        java.lang.StringBuilder sb = new StringBuilder();  
        
        //same as above, but above it more specific; ie if there were two 
        //libraries that share the same name, use the above syntax 
        StringBuilder sc = new StringBuilder("hello");


        //java.lang.StringBuffer, same but threadsafe (Slower) 
     }

 }