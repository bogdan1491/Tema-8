package ro.homework.metriccalculator;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the expression you want to compute distance (i.e. 7m+17cm+271mm), \nthen press enter and insert the desired final unit (i.e. mm, cm, m, km): ");
        Calculator calculator = new Calculator();
        StatisticsRepository repository = new StatisticsRepository();
        StopWatch stopwatch = new StopWatch().createStarted();
        calculator.compute(sc.nextLine(), sc.nextLine());
        stopwatch.stop();
        System.out.println("Time required for evaluate: " + stopwatch.getNanoTime() + " nanoseconds");
        repository.addTimeStatistics(stopwatch.getNanoTime());


    }

}
