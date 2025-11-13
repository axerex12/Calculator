package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger =  Logger.getLogger(Main.class.getName());
        Scanner scan = new Scanner(System.in);
        logger.info("enter first number");
        double num1 = scan.nextInt();

        logger.info("enter second number");
        double num2 = scan.nextInt();
        double result = addValues(num1,num2);
       logger.info(resultingString);
    }
    public static double addValues(double num1, double num2){
        return num1 + num2;
    }

}
