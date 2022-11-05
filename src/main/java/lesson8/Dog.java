package lesson8;

public class Dog extends Animal implements Pet { //main

    //Constructor
    public Dog(String name) {
        super(name);
    }

    //Implemented Method separetly (without override)
    void greets (Dog dog){
        System.out.println("Wooooof " + dog.getName());
    }

    //Implemented Methods
    @Override
    void greets() {
        System.out.println("dog "+getName()+ " says:'Gav'");
    }

    @Override
    public void feed() {
        System.out.println("feeding dog "+getName() );
    }

    @Override
    public void walk() {
        System.out.println("walking dog " + getName());
    }

    @Override
    public void play() {
        System.out.println("playing dog " +getName());
    }
} //end main
