class Person{
    public String name;
    public int age;
    public int mob;

    public Person()//name of constructor same as class name no return type
    {   
        System.out.println("From Constructor");

    }

    
}


public class constructors {
    
    public static void main(String args[])
    {
        Person p1=new Person();//object is created in memorywhenever main method is run constructor called automatically
        Person p2=new Person();
        Person p3=new Person();
      
    }
}
