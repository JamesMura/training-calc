import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Calculator calculator = new Calculator();
        assertThat(calculator.add(5,5),is(10));
    }

    @Test
    public void shouldSubtractTwoNumbers(){
       Calculator calculator = new Calculator();
       assertThat(calculator.subtract(4,2), is(2));
    }
    @Test
    public void shouldMultiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        assertThat(calculator.multiply(2,3),is(6));
    }
}
