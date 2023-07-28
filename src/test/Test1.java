package test;

public class Test1 {
    public static void main(String[] args) {
        /*
        Создайте функцию, которая принимает два аргумента
         (ширину и высоту) и выводит на экран прямоугольник из звездочек.
         */
        go(5,6);


    }

    public static void go(int width,int height){
        int [][] cube = new int[width][height];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
