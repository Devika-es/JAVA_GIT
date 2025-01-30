interface Birds
{
    void fly();
}
interface Crow extends Birds{
   void eat();
} 

class Parrot implements Crow
{
    public void eat()
    {
        System.out.println("Parrot eats");
    }
    public void fly()
    {
        System.out.println("Parrot flies");
    }
}
public class InterfaceExample
{
    public static void main(String[] args)
    {
        Crow mybird=new Parrot();
        mybird.fly();
        mybird.eat();
    }
}