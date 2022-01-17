package ru.zsa.restaurant;

public class Restaurant {
    private int count = 3;

    public synchronized void makeOrder(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        count--;
        while (count == 0) {
            System.out.println("Все официанты заняты");
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        System.out.println(Thread.currentThread().getName() + " делает заказ.");

        System.out.println("Приступил к еде.");
        count++;
    }
    public synchronized void payBill(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + " наелся, просит счет");
        count--;
        while (count == 0) {
            System.out.println("Все официанты заняты");
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        count++;
        System.out.println("Расплатился и ушел сытым");
        notifyAll();
    }

}
