package com.company;

import java.util.Scanner;

public class Main {
//    psvm
    public static void main(String[] args) {

        printEverything();

    }


//  access | returnOrNot | functionName | (parameters){}

    static     void           print        (String s){
        System.out.println(s);
    }

    static void printAll(){
        System.out.println("All");
    }

    static int sum(int a, int b){
        int skhum = a + b;
        return skhum;
    }

    static void printSum(int a, int b){
        System.out.println("sum = " + (a + b));
    }

    static int sub(int a, int b){
        return a - b;
    }

    static void printSub(int a, int b){
        System.out.println("sub = " + (a - b));
    }

    static int div(int a, int b){
        return a / b;
    }

    static void printDiv(int a, int b){
        System.out.println("div = " + (a / b));
    }

    static int mult(int a, int b){
        return a * b;
    }

    static void printMult(int a, int b){
        System.out.println("mult = " + (a * b));
    }

    static void printEverything(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls write the first number");
        int first = scanner.nextInt();
        System.out.println("Pls write the second number");
        int second = scanner.nextInt();
        printSum(first,second);
        printSub(first,second);
        printDiv(first,second);
        printMult(first,second);
    }

}
