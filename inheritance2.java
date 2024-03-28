class Birds
{
    void fly()
    {
        System.out.println("can fly");
    }
}
class Pigeon extends Birds{
    void eat()
    {
        System.out.println("can eat");
    }
}
class Crow extends Birds{
    void drink()
    {
        System.out.println("can drink");
    }
}

public class inheritance2 {
    public static void main(String args[])
    {
    Birds b1=new Birds();
    Crow c1=new Crow();
    c1.fly();
    b1.fly();
    c1.drink();
    }
}
