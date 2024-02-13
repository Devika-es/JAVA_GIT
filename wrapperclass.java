public class wrapperclass {
    public static void main(String args[])
    {
        int a=5;
        Integer myInt = Integer.valueOf(a);//boxing
        Integer myInt1 = a;//autoboxing=>conversion of primitive datatype into its corresponding wrapper class
        System.out.println(myInt);
        System.out.println(myInt1);

        // Integer a= 5;
        // int y=a.intValue();//unboxing
        // int x=a;//auto unboxing=>automatic conversion of wrapper type into its corresponding primitive type
        // System.out.println(x);
        
    }
}
