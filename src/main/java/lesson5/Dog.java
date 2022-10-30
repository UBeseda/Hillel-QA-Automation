package lesson5;

public class Dog { //main class
    private String name;
    private int age;
    private String color;
    private double height;

   // Констуктур приймає і передає 4 параметра
    public Dog(String name, int age, String color, double height) {
        this.name = name;
        if (age > 0 && age < 21) {
            this.age = age;
        }
        this.color = color;
        this.height = height;
    }
    // Конструктор 2 параметра - приймає і 2 параметра - задає значення за замовченням
    public Dog(int age, double height) {
        this.name = "Bobik";
        if (age > 0 && age < 21) {
            this.age = age;
        }
        this.color = "black"; //за замовченням
        this.height = height;
    }
    // Конструктор без параметрів
    public Dog() {
        System.out.println("Creating object of the class Dog");
    }

    //Getters for ALL fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    // Setters for ALL fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
            if (age > 0 && age < 21) {
            this.age = age;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Print all fields in console
    public void print (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
    }
} //main class
