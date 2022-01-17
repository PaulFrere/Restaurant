package ru.zsa.restaurant;

public class Waiter extends Thread{
    private Restaurant restaurant;

    public Waiter(String name, Restaurant restaurant){
        super(name);
        this.restaurant = restaurant;
    }
    @Override
    public void run(){
        for (int i = 0; i<2; i++){
            restaurant.makeOrder();
            restaurant.payBill();
        }
    }
}
