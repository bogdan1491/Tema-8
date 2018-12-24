import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import org.junit.*;
import ro.homework.metriccalculator.Calculator;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private String input;
    private String expected;
    private String unite;
    private Calculator calculator = new Calculator();


    @Parameterized.Parameters
    public static List<Object> data() {
        return Arrays.asList(new Object[][]{
                {"5m+5m", "10.0m", "m"},
                {"20cm+20cm", "40.0cm", "cm"},
                {"10mm+20cm", "21.0cm", "cm"},
                {"7mm+7mm", "14.0mm", "mm"},
                {"10mm+10mm", "0.02m", "m"},
                {"10mm-7mm", "3.0mm", "mm"},
                {"27mm-7mm", "2.0cm", "cm"},
                {"10mm+15mm+10mm", "35.0mm", "mm"},
                {"10mm+15mm+10mm", "3.5cm", "cm"},
                {"20mm+15mm+10mm", "0.045m", "m"},
                {"20mm-7mm-7mm", "6.0mm", "mm"},
                {"24mm-7mm-7mm", "1.0cm", "cm"},
                {"20mm-7mm-7mm", "0.006m", "m"},
                {"7mm+7cm", "77.0mm", "mm"},
                {"10m+10mm", "1001.0cm", "cm"},
                {"10cm+10m", "10.1m", "m"},
                {"10m-7mm", "9993.0mm", "mm"},
                {"27m-7cm", "2693.0cm", "cm"}


        });
    }

    public ParameterizedTest(String input, String expected, String unite) {
        this.input = input;
        this.expected = expected;
        this.unite = unite;

    }

    @Test
    public void testCompute() {
        assertEquals(expected, calculator.compute(input, unite).toString());
    }

}
