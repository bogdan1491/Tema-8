import org.junit.Test;
import ro.homework.metriccalculator.StatisticsRepository;
import static org.junit.Assert.assertEquals;



public class StatisticsRepositoryTest {

    @Test
    public void testWhenAddThreeDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        assertEquals(repository.getCount(), 3);
    }

    @Test
    public void testWhenAddFourDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        repository.addTimeStatistics(1123547898L);
        assertEquals(repository.getCount(), 4);
    }

    @Test
    public void testWhenAddFiveDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        repository.addTimeStatistics(1123547898L);
        repository.addTimeStatistics(12797551528L);
        assertEquals(repository.getCount(), 5);
    }

    @Test
    public void testWhenRemoveOneDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        repository.addTimeStatistics(1123547898L);
        repository.addTimeStatistics(12797551528L);
        repository.removeTimeStatistics(5123547898L);
        assertEquals(repository.getCount(), 4);
    }

    @Test
    public void testWhenRemoveTwoDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        repository.addTimeStatistics(1123547898L);
        repository.addTimeStatistics(12797551528L);
        repository.removeTimeStatistics(5123547898L);
        repository.removeTimeStatistics(3123547898L);
        assertEquals(repository.getCount(), 3);
    }@Test
    public void testWhenRemoveThreeDataToRepository() {
        StatisticsRepository repository = new StatisticsRepository();
        repository.addTimeStatistics(5123547898L);
        repository.addTimeStatistics(3123547898L);
        repository.addTimeStatistics(7123547898L);
        repository.addTimeStatistics(1123547898L);
        repository.addTimeStatistics(12797551528L);
        repository.removeTimeStatistics(5123547898L);
        repository.removeTimeStatistics(3123547898L);
        repository.removeTimeStatistics(12797551528L);
        assertEquals(repository.getCount(), 2);
    }

}
