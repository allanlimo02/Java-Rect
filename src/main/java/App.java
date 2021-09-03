import models.Rectangle;

import java.io.Console;
public class App {
    public static void main(String[] args) {
        Console cons = System.console();

        System.out.println("Hey! Kindly input Length oR Height of your Shape");
        String inputLength = cons.readLine();
        int intLength = Integer.parseInt(inputLength);
        System.out.println("Enter the width of your rectangle:");
        String inputWidth = cons.readLine();
        int intWidth = Integer.parseInt(inputWidth);
        Rectangle rect = new Rectangle(intLength, intWidth);
        boolean squareResult = rect.isSquare();
        System.out.println("Is your rectangle a square, too? " + squareResult + "!");


    }
}
