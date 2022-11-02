package lesson6.Work;

import lesson6.Objects.Cat;

public class lesson6 { //main
    public static void main(String[] args) { //static
        //Вивести 1 конструктор зі всіма параметрами
        Cat cat = new Cat(false, "mouse", 4, "black");
        System.out.println("Vegetarian: " + cat.isVegetarian() + "\n" + "Eats: " + cat.getEats() + "\n"
                + "noOfLegs: " + cat.getNoOfLegs() + "\n" + "color: " + cat.getColor());

        // для красоти перенесення - щоб в консолі все не зліпалось
        System.out.println("\n");

        //Вивести 2 конструктор зі всіма параметрами, але колір - за замовченням
        Cat cat1 = new Cat(true, "gress", 4 );
        System.out.println("Vegetarian: " + cat1.isVegetarian() + "\n" + "Eats: " + cat1.getEats() + "\n"
                + "noOfLegs: " + cat1.getNoOfLegs() + "\n" + "color: " + cat1.getColor());
 } //static
} //end of main
