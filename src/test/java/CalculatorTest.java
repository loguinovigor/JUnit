import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        // given:
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        // when:
        int result = calculator.add(a, b);

        // then:
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // given:
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        // when:
        int result = calculator.subtract(a, b);

        // then:
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        // given:
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        // when & then:
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });
    }
}

