package Calculator.MathProcessor;

public class Addition implements Calculator.MathProcessor.MathProcessor {
    @Override
    public int invoke(int first, int second) {
        return first+second;
    }
}
