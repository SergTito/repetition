package operatorThis;

public class Test {
     public  void st(){
         st2();
         this.st2();
     }
     public void st2(){
         System.out.println("Можно вызвать и так и так. но на практике так вызывать нельзя ");
     }

    public static void main(String[] args) {
        Test t = new Test();
        t.st();
    }
}
