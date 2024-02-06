class Bank{
    private int accNumber;//reserved keyword restrict use of variable in a method
    private String myName="Hello";
    //private int amount;

    public int getAccNumber()
    {
        return accNumber;
    }

    public String getName(){
        return myName;
    }

    public void setAccNumber(int accNumber)
    {
        this.accNumber=accNumber;//accNumber variable belongs to instance variable not local variable
    }


    public void setName(String myName)//to change value of string in private,pass string as an argument
    {  
        this.myName=myName;//always gives preference to local variable

    }
}



public class Encapsulation {
    public static void main(String args[])
    {
        Bank obj1=new Bank();
        obj1.getAccNumber();
       obj1.setAccNumber(2222);
       System.out.println(obj1.getAccNumber());
        //obj1.setName("World");
        //System.out.println(obj1.getAccNumber()+" "+obj1.getName());//+" "+obj1.myName+" "+obj1.amount);
    }
    
}
