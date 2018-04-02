package Calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataIn implements DataInput {

    public String operationInput;
    private String argStrY;
    private double argumentX;
    private double argumentY;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String getOperation() throws InvalidOperationExeption {
        try {
            System.out.println("Please choose the operation you would like to perform:");
            System.out.println("Press '+' for addition");
            System.out.println("Press '-' for diduction");
            System.out.println("Press '*' for multiplication");
            System.out.println("Press '/' for division");
            System.out.println("Press '<' to get square root");
            System.out.println("Press '>' for exponentiation");
            operationInput = scanner.nextLine();
            if (operationInput.compareTo("+") != 0 && operationInput.compareTo("-") != 0 && operationInput.compareTo("*") != 0 && operationInput.compareTo("/") != 0 && operationInput.compareTo("<") != 0 && operationInput.compareTo(">") != 0)
                throw new InvalidOperationExeption("You entered the invalid operation !");
            return operationInput;
        } catch (InvalidOperationExeption e) {
            System.out.println("You have entered the incorrect operation ! Repeat the enter");
            return getOperation();
        }
    }

    @Override

    public double getArgX() throws NumberFormatException {

        try {
            System.out.println("Enter the argument X");
            return argumentX = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered the incorrect argument!Please repeat the enter");
            return getArgX();
        }
    }

    public double getArgY() throws NumberFormatException {
        try {
            System.out.println("Enter the argument Y");
            return argumentY = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered the incorrect argument!Please repeat the enter");
            return getArgY();
        }
    }

    public String getOperationInput() {
        return operationInput;
    }

    public double getArgumentX() {
        return argumentX;
    }

    public double getArgumentY() {
        return argumentY;
    }
}
