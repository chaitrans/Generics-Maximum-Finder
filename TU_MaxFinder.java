import com.chaitra.max.MaxFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax1(){
        Integer int1 = 100, int2 = 50, int3 = 10;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(100, max, "Validating max method");
    }

    @Test
    void whenIntegerShouldReturnMax2() {
        Integer int1 = 50, int2 = 100, int3 = 10;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(100, max, "Validating max method");
    }

    @Test
    void whenIntegerShouldReturnMax3() {
        Integer int1 = 10, int2 = 50, int3 = 100;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(100, max, "Validating max method");
    }
}