 enum Days{
    MONDAY,
    TUESDAY,
    WEDNESDAY
}


public class enums {
    public static void main(String args[])
    {
        for(Days i : Days.values())
        {
            System.out.println(i);
        }
    }
}
