package oop_detergent_extends;

public class Detergent extends Cleanser {
    // Измененный метод
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//вызываем метод базового класса
    }

    // добавляем новые методы к интерфейсу:
    public void foam() {
        append("foam()");
    }
    // Проверяем новый класс

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        detergent.dilute();
        System.out.print(detergent);
    }
}

