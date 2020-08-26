package Printers;

public class ColorPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("\u001B[31m" + "PrintRed");
    }
}
