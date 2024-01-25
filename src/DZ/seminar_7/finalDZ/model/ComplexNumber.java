package DZ.seminar_7.finalDZ.model;

public class ComplexNumber {
    private float validNumber;
    private float imaginaryNumber;
    //private String i;
    private String operator = "";

    public ComplexNumber(float first, float second) {
        validNumber = first;
        imaginaryNumber = second;
        if (imaginaryNumber > 0) {
            operator = "+";
        } else if (imaginaryNumber < 0) {
            operator = "-";
        }
    }

    public ComplexNumber() {

    }

    public void initializationComplexNumber(String number) {
        int numberFirst = 0;
        int indexOperator = 1;
        int numberSecond = 2;
//
        String[] numbers = number.split(" ");
        validNumber = Float.parseFloat(numbers[numberFirst]);
        operator = numbers[indexOperator];
        if (operator.equals("+")) {
            imaginaryNumber = Float.parseFloat(
                    numbers[numberSecond].replace("i", "")
            );
        } else {
            imaginaryNumber = Float.parseFloat(
                    numbers[numberSecond].replace("i", "")
            );
            imaginaryNumber *= -1;
        }
    }
    public float getValidNumber() {
        return validNumber;
    }
    public float getImaginaryNumber() {
        return imaginaryNumber;
    }
    @Override
    public String toString() {
        if (operator.equals("")) {
            return String.format(
                    "z = %.2f",
                    validNumber
            );
        } else if (operator.equals("-")) {
            return String.format(
                    "z = %.2f %s %.2f",
                    validNumber, operator, imaginaryNumber * -1
            );
        } return String.format(
                "z = %.2f %s %.2fi",
                validNumber, operator, imaginaryNumber
            );
    }
}











