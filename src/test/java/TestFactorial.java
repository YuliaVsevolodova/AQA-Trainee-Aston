import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestFactorial {
    @Test
    public void testCalculateFactorial() {
        int input = 3;
        int expectedOutput = 6;
        int resultOutput = Factorial.calculateFactorial(input);
        Assert.assertEquals(resultOutput, expectedOutput, "Ошибка");
    }
}
