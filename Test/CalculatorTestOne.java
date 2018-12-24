import org.junit.Test;
import ro.homework.metriccalculator.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTestOne {
    Calculator calculator = new Calculator();
    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalMm() {
        String s = "7mm+7mm";
        assertEquals("14.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalCm() {
        String s = "10mm+10mm";
        assertEquals("2.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfTwoNumbersWithSameUnitAndFinalM() {
        String s = "10mm+10mm";
        assertEquals("0.02m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeSubtractionOfTwoNumbersWithSameUnitAndFinalMm() {
        String s = "10mm-7mm";
        assertEquals("3.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeSubtractionOfTwoNumbersWithSameUnitAndFinalCm() {
        String s = "27mm-7mm";
        assertEquals("2.0cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeSubtractionOfTwoNumbersWithSameUnitAndFinalM() {
        String s = "27mm-7mm";
        assertEquals("0.02m", calculator.compute(s, "m").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalMm() {
        String s = "10mm+15mm+10mm";
        assertEquals("35.0mm", calculator.compute(s, "mm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalCm() {
        String s = "10mm+15mm+10mm";

        assertEquals("3.5cm", calculator.compute(s, "cm").toString());
    }

    @Test
    public void testWhenComputeAdditionOfThreeNumbersWithSameUnitAndFinalM() {
        String s = "20mm+15mm+10mm";
        assertEquals("0.045m", calculator.compute(s, "m").toString());
    }
    @Test
    public void testWhenComputeSubtractionOfThreeNumbersWithSameUnitAndFinalMm() {
        String s = "20mm-7mm-7mm";
        assertEquals("6.0mm", calculator.compute(s, "mm").toString());
    }
    @Test
    public void testWhenComputeSubtractionOfThreeNumbersWithSameUnitAndFinalCm() {
        String s = "24mm-7mm-7mm";
        assertEquals("1.0cm", calculator.compute(s, "cm").toString());
    }
    @Test
    public void testWhenComputeSubtractionOfThreeNumbersWithSameUnitAndFinalM() {
        String s = "20mm-7mm-7mm";
        assertEquals("0.006m", calculator.compute(s, "m").toString());
    }
}
