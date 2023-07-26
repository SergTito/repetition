package operatorThis;

public class Person {
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("YUMMY =)");
    }

    class Peeler{
        static Apple peel(Apple apple){
            return apple;
        }
    }

    public class Apple{
        Apple getPeeled(){
            return Peeler.peel(this);
        }
    }
}

