package Calculator;

import java.io.IOException;
import java.util.InputMismatchException;

public interface DataInput {
    public String getOperation() throws InvalidOperationExeption;
    public double getArgX() throws NumberFormatException;
    public double getArgY()throws NumberFormatException;

}
