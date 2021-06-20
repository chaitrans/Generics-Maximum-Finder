import com.chaitra.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {
    @Test
    void whenFloatShouldReturnMax1() {
        Float num1 = 10.5f, num2 = 5.5f, num3 = 1.5f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(10.5f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax2() {
        Float num1 = 1.5f, num2 = 11.5f, num3 = 5.5f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(11.5f, max, "Validating max method");
    }

    @Test
    void whenFloatShouldReturnMax3() {
        Float num1 = 5.5f, num2 = 1.5f, num3 = 110.5f;
        Float max = MaxFinder.findMax(num1, num2, num3);
        Assertions.assertEquals(110.5f, max, "Validating max method");
    }
}