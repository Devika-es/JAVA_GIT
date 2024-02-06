class Calculate { // template(blueprint) just define how calculation is going to work
    // method
    // access_modifier return_type name_of_method()
    // {
    //
    // }
    public void test() {
        System.out.println("From test");
    }

    public int sub() {
        return 99;
    }

    public int add(int a, int b) // whenever we call add, it needs 2 arguments(2 integers)
    {
        return a + b;
    }

    public double add(double a, double b) { // local variable restricted to scope,so can be reused
        return a + b;
    }

    public int add(int a, int b, int c) { // same name not a problem, it'll be overloading
        return a + b + c;
    }

    // public void test() {
    // System.out.println("From test");
    // }
}

public class intro {
    public static void main(String args[]) {
        /*
         * Object and Classes
         * Object -> Attributes(var) & behaviours (methods)
         * Class -> is like a template
         */
        // new Calculate(); // to get access to calculate (made in a different memory ->
        // HEAP)
        /*
         * 2 Types of memory functioning here ->
         * STACK(LIFO) -> here all variables, and all work here
         * HEAP(dynamic memory) -> when new calculate() -> a new object is created in
         * heap, but we cannot exactly dereference/ find in heap directly(like stack)
         * (It is created in a random address)
         * THEREFORE A REFERENCE VARIABLE IS CREATED IN STACK
         */
        // Calculate obj = new Calculate(); // pointing towards type calculate (and
        // towards a new Calculate object)
        // // obj is reference towards the object
        // obj.test();
        // int v = obj.sub(); // because it is returning something
        // System.out.println(v); // 99
        // int sum = obj.add(1, 2);
        // System.out.println(sum); // 3
        // METHOD OVERLOADING -> according to datatype of argument function changes (
        // SAME NAME
        // When a class has multiple methods with same name but different parameters
        // It can be done by
        // * By changing the name of arguments
        // * By changing the data type
        // (same name of method with different type of parameters))
        // double sum1 = obj.add(1.001, 2.001);
        // System.out.println(sum1);
        // int sum2 = obj.add(1, 2, 3);
        // System.out.println(sum2);

        int num1 = 5;
        int num2 = 10;
        int num5 = 7;
        double num3 = 4.4;
        double num4 = 5.7;
        Calculate obj1 = new Calculate();
        var output = obj1.add(num1, num4);
        System.out.println(output);

    }
}
