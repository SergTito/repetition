package operatorThis;

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Person().new Apple());
    }
}
