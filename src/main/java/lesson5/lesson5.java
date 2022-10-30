package lesson5;

public class lesson5 { //main
    public static void main(String[] args) { //static
        // Перший конструктор
        Dog dog = new Dog("Gavr", 7, "brown", 0.7); // запустити конструктор, що приймає 4 параметра (GET) і встановлюе значення в 4 поля (SET)
        dog.print(); // приймає і виводить 4 параметра з об'єкта
        dog.setName("Bublik"); //встановлює нове значення імені
        System.out.println("\n"); // для красоти перенесення - щоб в консолі все не сліпалось

        dog.setAge(3); // встановлює нове значення віку
        dog.setColor("white"); //встановлює нове значення кольору
        dog.setHeight(0.9); //встановлює нове значення зросту
        System.out.println("Name: " + dog.getName() + "\n" + "Age: " + dog.getAge() + "\n" + "Color: " + dog.getColor() + "\n" + "Height: " + dog.getHeight()); // виводить нові значення, де \n - перенесення на слід рядок
        System.out.println("\n"); // для красоти перенесення - щоб в консолі все не сліпалось

        // Другий конструктор
        Dog dog1 = new Dog(1, 0.3);
        System.out.println("Name: " + dog1.getName() + "\n" + "Age: " + dog1.getAge() + "\n" + "Color: " + dog1.getColor() + "\n" + "Height: " + dog1.getHeight());
        System.out.println("\n"); // для красоти перенесення - щоб в консолі все не сліпалось

        // Третій конструктор
        Dog dog2 = new Dog();
    }// static
} //main
