package lesson6.Objects;

public class Animal { //main
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    //All Getters
    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    //All Setters
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    //1 Constructor with all parametrs
    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    //2 Constructor without parametrs (нічого не приймає)
    public Animal() {
    }

} //end of main.
