import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setupCalc() {
        calculator = new Calculator();
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


}
