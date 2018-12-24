package ro.homework.metriccalculator;

public class Distance {
    private Double value;
    private String measureUnit;


    public Distance(Double value, String measureUnit) {
        this.value = value;
        this.measureUnit = measureUnit;
    }

    public Distance() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    @Override
    public String toString() {
        return value + measureUnit;
    }
}
