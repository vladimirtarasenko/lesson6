package Calculator;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Calculator_Main {

    public static void main(String[] args) throws InvalidOperationExeption, NumberFormatException, NoSuchElementException, InvalidArgumentException {
        DataIn data = new DataIn();
        data.getOperation();
        data.getArgX();
        data.getArgY();
        Calculator calculator = new Calculator(data.getOperationInput(), data.getArgumentX(), data.getArgumentY());
        System.out.println("Result is " + calculator.getResult());
    }
}
