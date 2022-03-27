package com.company;

public class Order {

    String item;
    double price;
    int qty;

    public Order() {
    }

    public Order(String item, double price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
    }
}
