package staticInitialization;

public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Создание нового обьекта Cupboard в main()");
        new Cupboard();
        System.out.println("Создание нового обьекта Cupboard в main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    /*
    OUTPUT:
Bowl (1)
Bowl (2)
Table()
f1 (1)
Bowl (4)
Bowl (5)
Bowl (3)
Cupboard()
f1 (2)
Создание нового обьекта Cupboard в main()
Bowl (3)
Cupboard()
f1 (2)
Создание нового обьекта Cupboard в main()
Bowl (3)
Cupboard()
f1 (2)
f2 (1)
f3 (1)

     */
}
