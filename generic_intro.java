class Box<T>{
    T var;
    public T show()
    {
        return var;
    }
}
public class generic_intro {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        Box<String> b2 = new Box<>();
    }
}
