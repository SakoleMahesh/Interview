package Trickss;

import java.util.Scanner;

public class ArmstrongNumber {

	    public static boolean isArmstrong(int num) {
	        int original = num, sum = 0, digits = String.valueOf(num).length();

	        while (num > 0) {
	            int digit = num % 10;
	            int power = 1;
	            for (int i = 0; i < digits; i++) {
	                power *= digit;
	            }
	            sum += power;
	            num /= 10;
	        }
	        return sum == original;
	    }
	    
	   

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter The Number ");
	       int num= sc.nextInt();
	        System.out.println(num + " is Armstrong: " + isArmstrong(num));
	    }
	}

