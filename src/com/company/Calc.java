package com.company;

public class Calc {

//        fields
    int first, second;
    int sum, sub, div, mult;
    boolean something;


//       constructor
    public Calc(int first, int second) {
        this.first = first;
        this.second = second;
        this.sum = first + second;
        this.sub = first - second;
        this.mult = first * second;
        if (second == 0){
            this.div = 0;
        }else {
            this.div = first / second;
        }
//        if (second != 0){
//            this.div = first / second;
//        }else{
//            System.out.println("can't divide by zero");
//        }
    }

//       methods

    public void printSum(){
        System.out.println("sum = " + (first + second));
    }

    public void printSub(){
        System.out.println("sub = " + (first - second));
    }

    public void printDiv(){
        if (second == 0){
            System.out.println("can't divide by zero");
        }else{
            System.out.println("div = " + (first / second));
        }
    }

    public void printMult(){
        System.out.println("mult = " + (first * second));
    }

    public static int sum(int a, int b){
        return a+b;
    }

}
