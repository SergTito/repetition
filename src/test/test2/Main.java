package test.test2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sergey",28,29000.00);
        Person person2 = new Person("Mary",29,20900.00);
        Person person3 = new Person("Aida",48,11000.00);
        Person person4 = new Person("Spartak",50,15900.00);

        Person.compareSalaries(person1,person2);

    }
}
