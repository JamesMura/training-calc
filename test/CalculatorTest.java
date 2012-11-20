import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setupCalc() {
        calculator = new Calculator(new FakeRandom());
    }

    @Test
    public void shouldAddTwoNumbers() {
        assertThat(calculator.add(5, 5), is(10));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        assertThat(calculator.subtract(4, 2), is(2));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertThat(calculator.multiply(2, 3), is(6));
    }

    @Test
    public void shouldMultiplyByRandomNumber(){
        assertThat(calculator.multiplyByRandom(5),is(10));
    }

    private class FakeRandom extends Random{
        public int nextInt(){
            return 2;
        }
    }
}
