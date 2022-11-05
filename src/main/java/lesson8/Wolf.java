package lesson8;

public class Wolf extends Animal implements WildAnimal{

    //Constructor
    public Wolf(String name) {
        super(name);
    }
    //Implemented Methods
    @Override
    void greets() {
        System.out.println("Wolf " + getName() + " says:'Hawoo'");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getName() + " goes hunting");
    }
}
