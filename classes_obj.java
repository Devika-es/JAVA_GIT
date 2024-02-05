class Calculate{
    public void add(){
        System.out.println("From add");
    }
    public void test()
    {
        System.out.println("From test");
    }
}





public class classes_obj {
    public static void main(String[] args)
    {
        int num1=5;
        int num2=10;
       int result=num1+num2;
       System.out.println(result);
        Calculate obj1= new Calculate();
        obj1.add();
        obj1.test();
    }
}
