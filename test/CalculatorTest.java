import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Calculator calculator = new Calculator();
        assertThat(calculator.add(5,5),is(10));
    }
}
