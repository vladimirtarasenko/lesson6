package Calculator;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Calculator implements ResultOutput {
    private double result;
    public String operationInput;
    private double argumentX;
    private double argumentY;

    public Calculator(String operationInput, double argumentX, double argumentY) {
        this.operationInput = operationInput;
        this.argumentX = argumentX;
        this.argumentY = argumentY;
    }

    DataIn data = new DataIn();

    public double getResult() throws InvalidArgumentException {
        switch (operationInput) {
            case "+":
                result = argumentX + argumentY;
                break;
            case "-":
                result = argumentX - argumentY;
                break;
            case "*":
                result = argumentX * argumentY;
                break;
            case "/":
                try {
                    if (argumentY == 0) throw new InvalidArgumentException("You cannot divide by zero");
                    result = argumentX / argumentY;
                    break;
                } catch (InvalidArgumentException e) {
                    System.out.println("You cannot divide by zero!");
                    return result = argumentX / data.getArgY();
                }

            case "<":
                try {
                    if (argumentX < 0) throw new InvalidArgumentException("You cannot extract the root on negatives!");
                    result = sqrt(argumentX);
                    break;
                } catch (InvalidArgumentException e) {
                    System.out.println("You cannot extract the root on negative numbers!");
                    return result = sqrt(data.getArgX());
                }

            case ">":
                result = pow(argumentX, argumentY);
                break;
        }
        return result;
    }

}

