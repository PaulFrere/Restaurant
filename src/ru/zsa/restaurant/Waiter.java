package ru.zsa.restaurant;

public class Waiter extends Thread{
    private final Restaurant restaurant;
    private final String surname;
    private final int age;
    private final int experience;


    public Waiter(String name, String surname, int age, int experience, Restaurant restaurant){
        super(name);
        this.surname = surname;
        this.age = age;
        this.experience = experience;
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
