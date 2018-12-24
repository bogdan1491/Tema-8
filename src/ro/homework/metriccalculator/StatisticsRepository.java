package ro.homework.metriccalculator;

import java.util.ArrayList;
import java.util.List;


public class StatisticsRepository extends Calculator {
    List<Long> statistics = new ArrayList<>();
    private long time;

    public StatisticsRepository() {

    }

    public void addTimeStatistics(long time) {

        statistics.add(time);
    }

    public void removeTimeStatistics(long time) {

        statistics.remove(time);
    }

    public Object getCount() {

        return statistics.size();
    }

    public void printRepo() {
        System.out.println("Execution times added to the repository are: ");
        for (Long list : statistics) {
            System.out.println(list);
        }
    }
}
