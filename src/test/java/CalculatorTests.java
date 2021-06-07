import Calculator.MathProcessor.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CalculatorTests {
int result = 0;
boolean check;

    @Test
    public void DivisionByZeroCheck() throws IOException {
        MathProcessor division = new Division();
        try{
            result = division.invoke(1, 0);
        } catch (Exception e){
            check = false;
        }
        Assert.assertFalse(check);
    }

    @Test
    public void AdditionWorkCheck() throws IOException {
        MathProcessor addition = new Addition();
        result = addition.invoke(1, 2);
        if(result>2){
            check = true;
        }
        Assert.assertTrue(check);
    }

    @Test
    public void MultiplicationWorkCheck() throws IOException {
        MathProcessor multiplication = new Multiplication();
        result = multiplication.invoke(2, 2);
        if(result>2){
            check = true;
        }
        Assert.assertTrue(check);
    }

    @Test
    public void SubtractionWorkCheck() throws IOException{
        MathProcessor subtraction = new Subtraction();
        result = subtraction.invoke(2, 1);
        if (result<2){
            check = true;
        }
        Assert.assertTrue(check);
    }


}
