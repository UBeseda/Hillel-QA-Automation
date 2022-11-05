package lesson8;

public abstract class Animal { //main
    private String name;

    //Constructor
    public Animal(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }
    abstract void greets();

} //end of main
