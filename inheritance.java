class Animal{
    public void eat()
    {
        System.out.println("can eat");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println(" can bark");
    }
}

class BabyDog extends Dog{
    public void cry()
    {
        System.out.println("can eat");
    }
}

public class inheritance {
    public static void main(String args[])
    {
        //single inheritance

        // Dog d1 = new Dog();
        // Animal a1 = new Animal();
        // d1.eat();

        //multilevel inheritance
        BabyDog b1 = new BabyDog();
        b1.bark();
    }
}
