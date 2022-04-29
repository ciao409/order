package com.fju.order;

public class Order {
    int amount;
    int total
    Delivery delivery;

    public Order(int amount,Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
    }
    public int total() {
        total=amount + delivery.price;
        return total;
    }
}
