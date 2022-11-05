package lesson8;

public class BigDog extends Dog{

    //Constructor
    public BigDog(String name) {
        super(name);
    }

    //Implemented Methods
    @Override
    void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog dog) {
        System.out.println(dog.getName()+ " wooooooof");
    }
    void greets (BigDog bigDog){
        System.out.println(bigDog.getName() + " woooooof2");
    }
}
