// In Java, an interface is a blueprint of a class that contains abstract methods (methods without a body)
// and constants (public, static, and final variables). 
// It is used for achieving abstraction and multiple inheritance.



interface Animal
{
    void sound();
}

class Dog implements Animal{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal{
    public void sound()
    {
        System.out.println("Cat meows");
    }
}
public class interface1
{
    public static void main(String[] args) {
        Animal myDog=new Dog();
        Animal myCat=new Cat();

        myDog.sound();
        myCat.sound();
        
    }
}