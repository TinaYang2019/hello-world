public class test {
    public static void main(String[] args) {
        int a=10;
        int b=++a;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        sayHello();
        System.out.println("End");
    }

    public static void sayHello(){
       for (int i=0; i<20;i++){
           System.out.println("SayHello:"+i);
       }
    }
}
