public class p1 {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();

        System.out.println("Hello, World");
        System.out.println("Hello, World2");
        System.out.println("Hello, World3");
        System.out.println("Hello, World3");
        System.out.println("Hello, World3");
        myPrinter.PrintOnce();
        myPrinter.PrintTwice();
        myPrinter.PrintN(2);
    }

}
