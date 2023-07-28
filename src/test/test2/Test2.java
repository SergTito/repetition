package test.test2;

import java.util.Scanner;

public class Test2 {
    /*
    - Создайте класс "Person" с полями "имя", "возраст" и "зарплата".
    - Напишите конструкторы для этого класса и методы доступа к полям.
    - Добавьте метод calculateYearsToRetirement(), который будет возвращать количество лет,
    - оставшихся до пенсии для каждого объекта "Person". Предположим, что пенсионный возраст составляет 65 лет.
    - Если возраст объекта уже превышает 65 лет, метод должен возвращать 0.
    - Добавьте методы increaseSalary(double amount) и decreaseSalary(double amount),
    - которые позволяют увеличивать и уменьшать зарплату человека на заданную сумму.
    - Добавьте статическое поле averageSalary, которое будет хранить информацию о средней зарплате всех созданных объектов
    - "Person". Каждый раз, когда изменяется зарплата какого-либо человека,
    - обновляйте значение averageSalary соответственно.
    - Добавьте статический метод compareSalaries(Person person1, Person person2),
    - который будет сравнивать зарплату двух объектов "Person" и возвращать значение сравнения.
    Добавьте метод printPersonInfo(), который будет выводить на экран информацию о
    человеке в форматеИмя: [имя], Возраст: [возраст], Зарплата: [зарплата].
     */


}

class Person {
    private String name;
    private int age;
    private double salary;
    private static double totalSalary = 0.0; // Сумма всех зарплат
    private static int numberOfPersons = 0; // Количество созданных объектов Person

    //Добавьте статическое поле averageSalary, которое будет хранить информацию о средней зарплате всех созданных объектов
    //"Person". Каждый раз, когда изменяется зарплата какого-либо человека,
    //обновляйте значение averageSalary соответственно.

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        totalSalary += salary;
        numberOfPersons++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public int calculateYearsToRetirement() {
        int yearsUntil = 65;
        if (getAge() < yearsUntil) {
            System.out.println("До пенсии осталось " + (yearsUntil - getAge()) + "Лет");
        }
        return 0;
    }

    //Добавьте методы increaseSalary(double amount) и decreaseSalary(double amount),
    //которые позволяют увеличивать и уменьшать зарплату человека на заданную сумму.
    public void increaseSalary(double amount) {
        double increase = getSalary() + amount;
        System.out.println("Зарплата увеличена до " + increase + " руб.");
        totalSalary = totalSalary - amount;// Обновляем сумму всех зарплат

    }

    public void decreaseSalary(double amount) {
        double decrease = getSalary() + amount;
        System.out.println("Зарплата уменшена до " + decrease + " руб.");
        totalSalary -= amount;// Обновляем сумму всех зарплат
    }

    public static double getAverageSalary() {
        if (numberOfPersons > 0) {
            double average = totalSalary / numberOfPersons;
            System.out.println("Средняя зарплата всех созданных Person: " + average);
            return average;
        } else System.out.println("Нет созданных объектов Person, невозможно вычислить среднюю зарплату.");
        return 0.0;
    }
    //Добавьте статический метод compareSalaries(Person person1, Person person2),
    //который будет сравнивать зарплату двух объектов "Person" и возвращать значение сравнения.

    public static void compareSalaries(Person person1, Person person2) {
        System.out.println("Сравнение зарплаты " + person1.getName() + " и " + person2.getName());
        if (person1.getSalary() > person2.getSalary()) {
            double comparison = person1.getSalary() - person2.getSalary();
            System.out.println("У " + person1.getName() + "денег больше на " + comparison + " руб.");
        }else if (person1.getSalary() < person2.getSalary()) {
            double comparison = person2.getSalary() - person1.getSalary();
            System.out.println("У " + person2.getName() + "денег больше на " + comparison + " руб.");
        }else System.out.println("у них одинаковая зарплата");
    }


}
