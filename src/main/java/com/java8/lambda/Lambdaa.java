package com.java8.lambda;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Lambdaa {

    @SuppressWarnings({ "null", "unchecked" })
	public static void main(String[] args) {
        // Define a lambda function for addition
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a +b;
        
        System.out.println("The sum is: " +  add.apply(5, 3));
        BiConsumer<Integer,Integer>addbiconsumer=(a,b)->System.out.println(a+b);
        addbiconsumer.accept(5,6);
        String str="hello";
        String sts=new StringBuilder(str).reverse().toString();
        System.out.println(sts);
        String Statment="Hello Java";
        String[] words = Statment.split(" ");;
        TreeSet tree=new TreeSet();
        tree.add(new String());
        tree.add(new String("a"));
       // tree.add(new Integer(14));
        System.out.println(tree);
        StringBuilder reversedStatement = new StringBuilder() ;

        for (String word : words) {
        	
            StringBuilder reversedWord = new StringBuilder(word);
            reversedStatement.append(reversedWord.reverse().toString()+" ");
            System.out.println(Arrays.toString(words));
            System.out.println(reversedStatement);
        }
    }
}
