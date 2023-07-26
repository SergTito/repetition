package methodOverloadingWithPrimitives;

public class Test {

    void f1(char x ){
        System.out.print("F1(char) ");
    }void f1(byte x ){
        System.out.print("F1(byte) ");
    }void f1(short x ){
        System.out.print("F1(short) ");
    }void f1(int x ){
        System.out.print("F1(int) ");
    }void f1(double x ){
        System.out.print("F1(double) ");
    }void f1(long x ){
        System.out.print("F1(long) ");
    }void f1(float x ){
        System.out.print("F1(float) ");
    }

    void f2(byte x ){
        System.out.print("F2(byte) ");
    }void f2(short x ){
        System.out.print("F2(short) ");
    }void f2(int x ){
        System.out.print("F2(int) ");
    }void f2(double x ){
        System.out.print("F2(double) ");
    }void f2(long x ){
        System.out.print("F2(long) ");
    }void f2(float x ){
        System.out.print("F2(float) ");
    }
    void f3(short x ){
        System.out.print("F3(short) ");
    }void f3(int x ){
        System.out.print("F3(int) ");
    }void f3(double x ){
        System.out.print("F3(double) ");
    }void f3(long x ){
        System.out.print("F3(long) ");
    }void f3(float x ){
        System.out.print("F3(float) ");
    }
    void f4(int x ){
        System.out.print("F4(int) ");
    }void f4(double x ){
        System.out.print("F4(double) ");
    }void f4(long x ){
        System.out.print("F4(long) ");
    }void f4(float x ){
        System.out.print("F4(float) ");
    }
    void f5(double x ){
        System.out.print("F5(double) ");
    }void f5(long x ){
        System.out.print("F5(long) ");
    }void f5(float x ){
        System.out.print("F5(float) ");
    }
    void f6(double x ){
        System.out.print("F6(double) ");
    }void f6(float x ){
        System.out.print("F6(float) ");
    }
    void f7(double x ){
        System.out.print("F7(double) ");
    }
    void testConstVal(){
        System.out.print("5: ");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
        System.out.println();
    }
    void testChar(){
        char x = 'x';
        System.out.println("char: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testByte(){
        byte x = 0;
        System.out.println("Пример типа byte: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }
    void testShort(){
        short x = 0;
        System.out.println("short: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testLong(){
        long x = 0;
        System.out.println("long: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testInt(){
        int x = 0;
        System.out.println("int: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testFloat(){
        float x = 0;
        System.out.println("float: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }
    void testDouble(){
        double x = 0;
        System.out.println("Double: ");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
        System.out.println();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.testConstVal();
        t.testChar();
        t.testDouble();
        t.testFloat();
        t.testInt();
        t.testLong();
        t.testShort();
        t.testByte();
    }
}
