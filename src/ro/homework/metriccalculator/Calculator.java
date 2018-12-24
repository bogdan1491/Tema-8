package ro.homework.metriccalculator;

public class Calculator {
    private int index = 0;
    Converter converter = new Converter();

    public Distance compute(String s, String finalUm) {
        try {
            validateString(s);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        Distance prevResult = readDistance(s);
        Distance nextNumber;
        String operation;
        Distance result = new Distance();

        while (index < s.length()) {
            operation = getOperator(s);
            nextNumber = readDistance(s);
            result = computeDistance(prevResult, nextNumber, operation);
            prevResult = result;
        }
        print(s, result, finalUm);
        return result;
    }


    public Distance readDistance(String s) {

        double value = 0;
        String unitOfMeasure = "";

        if (index < s.length()) {
            while (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                value = value * 10 + Character.getNumericValue(s.charAt(index));
                index++;
            }

            while (index < s.length() && s.charAt(index) >= 'a' && s.charAt(index) <= 'z') {
                unitOfMeasure = unitOfMeasure + s.charAt(index);
                index++;
            }
            try {
                validateUnit(unitOfMeasure);
            } catch (UnitValidationException e) {
                System.out.println(e.getMessage());
            }
        }

        Distance dis = new Distance(value, unitOfMeasure);
        return dis;

    }

    public Distance computeDistance(Distance dis1, Distance dis2, String operation) {
        Distance result = new Distance();
        Distance newDV;
        if (!dis1.getMeasureUnit().equals(dis2.getMeasureUnit())) {
            newDV = converter.convert(dis2, dis1.getMeasureUnit());
        } else newDV = dis2;
        switch (operation) {
            case "addition":
                result.setValue(dis1.getValue() + newDV.getValue());
                result.setMeasureUnit(dis1.getMeasureUnit());
                break;
            case "subtraction":
                result.setValue(dis1.getValue() - newDV.getValue());
                result.setMeasureUnit(dis1.getMeasureUnit());
                break;
        }
        return result;
    }

    public String getOperator(String s) {


        if (index < s.length()) {
            switch (s.charAt(index)) {
                case '+':
                    index++;
                    return "addition";
                case '-':
                    index++;
                    return "subtraction";
                default:
                    System.out.println("Please insert an operator (i.e. + or -)");
            }
        }

        return null;
    }

    private void print(String s, Distance dis, String finalUm) {
        if (!dis.getMeasureUnit().equals(finalUm)) {
            Distance convertedDv = converter.convert(dis, finalUm);
            dis = convertedDv;
        }
        System.out.println(s + "=" + dis.toString());
    }

    public void validateString(String s) throws ValidationException {
        for (int i = 0; i < s.length(); i++) {
            if (!((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '+' || s.charAt(i) == '-'
                    || s.charAt(i) == 'm' || s.charAt(i) == 'c' || s.charAt(i) == 'd' || s.charAt(i) == 'k')) {
                throw new ValidationException("Input unsupported. Please try again " +
                        "i.e. 7m+17cm+271mm.");
            }
        }
    }

    public void validateUnit(String um) throws UnitValidationException {
        if (!(um.equals("mm") || um.equals("cm") || um.equals("dm") || um.equals("m") || um.equals("km"))) {
            throw new UnitValidationException("Unit of measure unsupported. Please ty again " +
                    "The accepted unit are: mm, cm, m, km.");
        }
    }

}
