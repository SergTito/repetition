package methodFinalize;

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //правиьная очистка
        novel.checkIn();
        // теряем ссылку забыли про очистку
        new Book(true);
        //принудительная уборка муссора и финализация
        System.gc();

        /*
        OUTPUT:
        Ошибка : checkedOut
         */
    }
}
