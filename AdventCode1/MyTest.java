package AdventCode1;

public class MyTest {


    public static void a(){
        System.out.println("in a, before b");
        try{
            MyTest.b();
        }catch(Exception ex){
            System.out.println("catch");    
        }
        System.out.println("in a, after b");
    }
    public static void b(){
        System.out.println("in b, before c");
            MyTest.c();
        System.out.println("in b, after c");
    }
    public static void c(){
        throw new IllegalStateException("an exception");        
    }

    public static void main(String[] args) {
        MyTest.a();
    }
}