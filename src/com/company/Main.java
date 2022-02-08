package com.company;

public class Main {

    public static void main(String[] args) {
	    FizzBuzz(100);
    }

    //for loop that will iterate through each value in a set of numbers
    public static void FizzBuzz(int x){
        for(int i = 1; i <= x; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
