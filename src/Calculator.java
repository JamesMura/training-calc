import java.util.Random;

// Understands how to perform computations

public class Calculator {

    private Random random;

    public Calculator(Random random) {
        this.random = random;
    }

    public Integer add(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }

    public Integer subtract(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

    public Integer multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public Integer multiplyByRandom(int number) {
        return random.nextInt() * number;
    }
}
