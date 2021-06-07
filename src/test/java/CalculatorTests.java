import Calculator.MathProcessor.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CalculatorTests {
boolean check;

    @Test
    public void DivisionByZeroCheck() throws IOException {
        MathProcessor division = new Division();
        try{
            division.invoke(1, 0);
        } catch (Exception e){
            check = false;
        }
        Assert.assertFalse(check);
    }

    @Test
    public void AdditionWorkCheck() throws IOException {
        MathProcessor addition = new Addition();
        if(addition.invoke(1, 2)>2){
            check = true;
        }
        Assert.assertTrue(check);
    }

    @Test
    public void MultiplicationWorkCheck() throws IOException {
        MathProcessor multiplication = new Multiplication();
        if(multiplication.invoke(2, 2)>2){
            check = true;
        }
        Assert.assertTrue(check);
    }

    @Test
    public void SubtractionWorkCheck() throws IOException{
        MathProcessor subtraction = new Subtraction();
        if (subtraction.invoke(2, 1)<2){
            check = true;
        }
        Assert.assertTrue(check);
    }


}
