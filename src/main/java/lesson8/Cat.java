package lesson8;

public class Cat extends Animal implements Pet{

    //Constructor
    public Cat(String name) {
        super(name);
    }
    //Implemented Methods
    @Override
    void greets() {
        System.out.println("Cat " + getName() + " says:'Meow'");
    }

    @Override
    public void feed() {
        System.out.println("feeding cat "+getName() );
    }

    @Override
    public void walk() {
        System.out.println("walking cat " + getName());
    }

    @Override
    public void play() {
        System.out.println("playing cat " +getName());
    }
}
