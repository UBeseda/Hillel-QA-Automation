package lesson8;

public class Lion extends Animal implements WildAnimal{//main

    //Constructor
    public Lion(String name) {
        super(name);
    }

    //Implemented Methods
    @Override
    void greets() {
        System.out.println("Lion " + getName() + " says:'Roar'");
    }

    @Override
    public void hunting() {
        System.out.println("Lion " + getName() + " goes hunting");
    }
}//end of main
