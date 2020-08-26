package Printers;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter();
        printer.print();
        colorPrinter.print();
    }
}
