package com.company;

import java.util.Scanner;

public class Main {
//    psvm
    public static void main(String[] args) {

//        Person p1 = new Person();
//        Person p2 = new Person(2);
//        Person p3 = new Person("Rossita","Aaronson");
//        Person p4 = new Person(4,23);
//        Person p5 = new Person(5,"Tom","Sawer",16);
//
//        Order order1 = new Order();
//        Order order2 = new Order("Banana",20.0,5);
//
//        Calc calc1 = new Calc(9,0);
//        Calc calc2 = new Calc(8,2);
//
//
//
//        calc1.printSum();
//        calc2.printSum();
//
//        calc1.printSub();
//        calc1.printMult();
//        calc1.printDiv();
//
//        System.out.println(calc1.first + calc2.second);
//
//        System.out.println(calc1.div);
        Car car1 = new Car(5,"Skoda",false);
        Car car2 = new Car();
        Car car3 = new Car(4);
        car2.model = "Fiat";
        car3.model = "Kia";


//        System.out.println(car1.doors);
//        System.out.println(car1.model);
//        System.out.println(car1.isElectric);
//        car1.drive();
//        car2.drive();
//        car3.drive();
//
//        car1.stop();
//        car2.stop();
//        car3.stop();
//        System.out.println(car1.price(2001));
//        System.out.println(car1.price(true));
//        System.out.println(car1.toString());
//        System.out.println(car2);
//        System.out.println(car3);
 
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


