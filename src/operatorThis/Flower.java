package operatorThis;

public class Flower {
    /**Вызов конструкторов с использованием  "this" */

    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalCount = "+ petalCount);
    }
    Flower(String ss ){
        System.out.println("Конструктор с параметром String, s ="+ss);
        s = ss;
    }
    Flower(String s,int patals){
        this(patals);
        //! this(s); // вызов другого конструктора запрещен!
        this.s = s; // другое использование "this"
        System.out.println("Фргументы String и int");
    }
    Flower(){
        this("hi",47);
        System.out.println("Конструктор по умолчанию (без аргументов)");
    }
    void printPetalCount(){
        //! this(11);// разрешаеться только в конструкторах
        System.out.println("petalCount = "+ petalCount+" s = "+ s);
    }

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }

    /*OUTPUT:
    Конструктор с параметром int, petalCount = 47
    Фргументы String и int
    Конструктор по умолчанию (без аргументов)
    petalCount = 47 s = hi

     */
}
