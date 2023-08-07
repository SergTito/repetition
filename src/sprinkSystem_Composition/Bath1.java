package sprinkSystem_Composition;

public class Bath1 {
    private String // Инициализация в точке определения :
            s1 = "Счастливый",
            s2 = "Счастливый",
            s3, s4;
    private Soap1 castille;
    private int i;
    private float toy;
    public Bath1(){
        System.out.println("В конструкторе Bath1()");
        s3 = "Радостный";
        toy = 3.14f;
        castille = new Soap1();
    }
    //Инициализация экземпляра
    {i = 47;}

    @Override
    public String toString() {
        if (s4 == null)// Отслеживание инициализация
            s4 = "Радостный";
        return
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castille=" + castille +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath1 b = new Bath1();
        System.out.println(b);
    }
}
