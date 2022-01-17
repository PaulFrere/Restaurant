package ru.zsa.restaurant;

public class Visitor extends Thread{
    private Restaurant restaurant;

    public Visitor(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }
    @Override
    public void run(){
            restaurant.makeOrder();
            restaurant.payBill();
    }
}
