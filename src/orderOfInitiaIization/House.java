package orderOfInitiaIization;

public class House {
    Window w1 = new Window(1); //Перед конструктором
    House(){
        //Показывает, что выполняеться конструктор
        System.out.println("House()");

        Window w3 = new Window(33);//Повторная инициализация w3
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);// в конце

}


