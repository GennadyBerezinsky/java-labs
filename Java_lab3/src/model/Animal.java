package model;

/**
 * Created by User on 22.09.2018.
 */


public class Animal {
    private final Classyficator classyficator;
    private int age;
    private String color;

    public Animal(Classyficator classyficator, int age, String color) {
        this.classyficator = classyficator;
        this.age = age;
        this.color = color;
    }

    public Classyficator getClassyficator(){
        return classyficator;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return classyficator.toString() + " " + age + " " + color;
    }

    public Animal checkAge(int age){
        Animal animal = null;
        if(age <= this.age){
            animal = this;
        }
        return animal;
    }

    public Animal getCurOrder(String order){
        Animal animal = null;
        if(order.equalsIgnoreCase(this.classyficator.getOrder())){
            animal = this;
        }
        return animal;
    }

    public Animal getCurGenusAndColor(String genus, String color){
        Animal animal = null;
        if(genus.equalsIgnoreCase(this.classyficator.getGenus())
                && color.equalsIgnoreCase(this.color)){
            animal = this;
        }
        return animal;
    }


}
