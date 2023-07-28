package orderOfInitiaIization;

public class OrderOfInitiaIization {
    public static void main(String[] args) {
        House h = new House();
        h.f();// Показывает что обьект сканирован

        /*
        OUTPUT:
        Window (1)
        Window (2)
        Window (3)
        House()
        Window (33)
        f()
         */
    }
}
