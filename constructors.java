class Person{
    public String name;
    public int age;
    public int mob;

    public Person()//name of constructor same as class name no return type
    {   
        System.out.println("From Constructor");
        

    }
    public Person(String name,int age,int mob) // Parameterized COnstructor
    {
        this.name = name;
        this.age = age;
        this.mob = mob;
    }

    public void output(){
        System.out.println("Name: "+name+" age: "+" mobileNo: "+mob);
    }

    
}


public class constructors {
    
    public static void main(String args[])
    {
        Person p1=new Person();//object is created in memorywhenever main method is run constructor called automatically
        Person p2=new Person();
        p1.output();
        Person p3=new Person("John",22,1234);
      
    }
}
