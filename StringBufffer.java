public class StringBufffer {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        sb.insert(0,"J");
        System.out.println(sb.capacity());
        System.out.println(sb);

    }
}
