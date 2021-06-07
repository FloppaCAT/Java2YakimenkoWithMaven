package Calculator.MathProcessor;

public class Division implements Calculator.MathProcessor.MathProcessor {
    @Override
    public int invoke(int first, int second) {
        return first/second;
    }
}
