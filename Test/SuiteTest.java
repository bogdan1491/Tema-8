import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorTestOne.class,
        CalculatorTestTwo.class,
        ParameterizedTest.class,
        StatisticsRepositoryTest.class

})
public class SuiteTest {


}
