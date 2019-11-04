public class Printer {

    public void PrintOnce() {
        System.out.println("Hello, PrintOnce");
    }

    public void PrintTwice() {
        System.out.println("Hello, PrintTwice");
        System.out.println("Hello, PrintTwice");
    }

    public void PrintN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, PrintN");
            System.out.println("Hello, PrintN");
        }
    }
}