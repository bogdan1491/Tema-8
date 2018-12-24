package ro.homework.metriccalculator;

public class Converter {
    private String[][] coefficientTable = {
            {"", "mm", "cm", "dm", "m", "km"},
            {"mm", "1", "0.1", "0.01", "0.001", "0.000001"},
            {"cm", "10", "1", "0.1", "0.01", "0.00001"},
            {"dm", "100", "10", "1", "0.1", "0.0001"},
            {"m", "1000", "100", "10", "1", "0.001"},
            {"km", "1000000", "100000", "10000", "1000", "1"}};

    public  Double getCoefficient(String firstUnit, String toBeConvertedIn) {
        Integer x = getFirstUnit(firstUnit);
        Integer y = getLastUnit(toBeConvertedIn);
        return Double.parseDouble(coefficientTable[x][y]);
    }

    public  Distance convert(Distance distanceValue, String desiredUnit) {
        Double coefficient = getCoefficient(distanceValue.getMeasureUnit(), desiredUnit);
        double newValue = distanceValue.getValue() * coefficient;
        distanceValue.setValue(newValue);
        distanceValue.setMeasureUnit(desiredUnit);
        return distanceValue;
    }

    private Integer getFirstUnit(String firstUnit) {

        for (int i = 0; i < coefficientTable.length; i++
        ) {
            if (coefficientTable[i][0].equals(firstUnit)) {
                return i;
            }
        }
        return null;
    }

    private Integer getLastUnit(String toBeConvertedIn) {
        for (int i = 0; i < coefficientTable[0].length; i++) {
            if (coefficientTable[0][i].equals(toBeConvertedIn)) {
                return i;
            }
        }

        return null;
    }
}
