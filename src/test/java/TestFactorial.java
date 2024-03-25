import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFactorial {
    @Test
    public void testCalculateFactorial() {
        Assertions.assertEquals(6, Factorial.calculateFactorial());
    }
}
