package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Scanner scan = new Scanner(System.in);
        logger.info("enter first number");
        double num1 = scan.nextDouble();

        logger.info("enter second number");
        double num2 = scan.nextDouble();
        double result = addValues(num1, num2);
        logger.info(String.valueOf(result));
    }

    public static double addValues(double num1, double num2) {
        return num1 + num2;
    }

    public static double multiplyValues(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideValues(double num1, double num2) {
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static double subtractValues(double num1, double num2) {
        return num1 - num2;
    }

}
