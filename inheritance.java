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



public class inheritance {
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();
        d1.eat();
    }
}
