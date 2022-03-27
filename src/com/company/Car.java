package com.company;

class Car {

//  1) Fields
    static int currentYear = 2022;
    int doors;
    String model;
    boolean isElectric;

//  2) Constructor
    public Car() {
    }

    public Car(int doors) {
        this.doors = doors;
    }

    public Car(int doors, String model, boolean isElectric) {
        this.doors = doors;
        this.model = model;
        this.isElectric = isElectric;
    }

// 3) Methods(functions)
    public void drive(){
        System.out.println(model + " is driving");
    }

    public void stop(){
        System.out.println(model + " has stopped");
    }

//  Overload
    public int price(int year){
        if (year < 1970){
            return 0;       // and
        }else if (year >= 1970 && year <= 2000){
            return 1000;
        }else if (year <= 2022){
            return 2000;
        }else{
            return 0;
        }
    }

    public int price(boolean hadAccident){
        if (hadAccident){
            return 0;
        }else{
            return 2000;
        }
    }

//  Override
    @Override
    public String toString() {
        return "This car is " + model + " and it has " + doors + " doors";
    }
}
