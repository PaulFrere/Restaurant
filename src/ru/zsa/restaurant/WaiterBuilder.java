package ru.zsa.restaurant;

public class WaiterBuilder {
    private String name;
    private String surname;
    private int age;
    private int experience;
    private Restaurant restaurant;

    public Waiter build(){
        if (name == null){
            throw new IllegalStateException("Необходимо указать имя для Waiter");
        }
        if (surname == null){
            throw new IllegalStateException("Необходимо указать фамилие для Waiter");
        }
        if (experience == 0){
            throw new IllegalStateException("Необходимо указать опыт для Waiter");
        }
        return new Waiter(name, surname, age, experience, restaurant);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            throw new IllegalArgumentException("Возраст должен быть совершеннолетним: " + age);
        }
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0){
            throw new IllegalArgumentException("Опыт не должен быть меньше 0: " + experience);
        }
        this.experience = experience;
    }

    public void start() {
    }
}
