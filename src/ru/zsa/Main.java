package ru.zsa;

import ru.zsa.restaurant.Restaurant;
import ru.zsa.restaurant.Visitor;
import ru.zsa.restaurant.Waiter;
import ru.zsa.restaurant.WaiterBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        List<Visitor> visitors = new ArrayList<>(10);
        visitors.add(new Visitor("Александр", restaurant));
        visitors.add(new Visitor("Алексей", restaurant));
        visitors.add(new Visitor("Олег", restaurant));
        visitors.add(new Visitor("Максим", restaurant));
        visitors.add(new Visitor("Иван", restaurant));
        visitors.add(new Visitor("Галина", restaurant));
        visitors.add(new Visitor("Мария", restaurant));
        visitors.add(new Visitor("Анна", restaurant));
        visitors.add(new Visitor("Елена", restaurant));
        visitors.add(new Visitor("Татьяна", restaurant));

        
        Waiter waiter1 = new WaiterBuilder()
                .setName("Дмитрий")
                .setSurname("Иванов")
                .setAge(25)
                .setExperience(6)
                .build();

        Waiter waiter2 = new WaiterBuilder()
                .setName("Денис")
                .setSurname("Петров")
                .setAge(23)
                .setExperience(7)
                .build();
        
        waiter1.start();
        waiter2.start();

        for (Visitor visitor : visitors){
            visitor.start();
        }
        
    }
}
