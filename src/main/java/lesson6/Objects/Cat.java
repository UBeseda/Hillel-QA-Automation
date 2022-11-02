package lesson6.Objects;

public class Cat extends Animal {//main
    private String color;

    //Getter
    public String getColor() {
        return color;
    }

    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    //1 Сonstructor - all parametrs: Parent (Animal) + Personal (Cat)
    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }
    //2 Сonstructor - all parametrs: Parent (Animal) + Personal (Cat - колір за замовченням)
    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "white";
    }
} //end of main.
