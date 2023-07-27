package methodFinalize;

//Использование finalize() для выявления обьекта
// не осуществившего необходимой финализации.
public class Book   {
    boolean checkedOut = false;
    Book(boolean checkOut){
        checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    public void finalize(){
        if (checkedOut){
            System.out.println("Ошибка: checkedOut");
            //обычно это делаеться так
            //Super.finalize();//вызов версии базового класса
        }
    }
}

