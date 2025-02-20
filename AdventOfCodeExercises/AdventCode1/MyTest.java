package AdventCode1;

public class MyTest {

    public static void insertOrder() {
        System.out.println("Inserting order");
        try {
            MyTest.processUserOrder();
            System.out.println("Request processed successfully");
        } catch (Exception ex) {
            System.out.println("Order insertion failed: " + ex.getMessage());
        }
    
    }

    public static void processUserOrder() {
        MyTest.debitUser();
        MyTest.saveOrder();
    }

    public static void saveOrder() {
        System.out.println("Order saved");
    }

    public static void debitUser() {
        throw new IllegalStateException("Insufficient funds");
    }

    public static void main(String[] args) {
        MyTest.insertOrder();
    }
}