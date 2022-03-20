package com.company;

import java.util.Scanner;

public class Main {
//    psvm
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(2);
        Person p3 = new Person("Rossita","Aaronson");
        Person p4 = new Person(4,23);
        Person p5 = new Person(5,"Tom","Sawer",16);


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


    static void printEveryLetter(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    static void printArray(String[] arrStr){
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }
    }
}
