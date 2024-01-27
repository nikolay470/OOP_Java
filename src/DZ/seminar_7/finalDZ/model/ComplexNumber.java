package DZ.seminar_7.finalDZ.model;

import java.nio.file.FileAlreadyExistsException;

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

    public boolean initializationComplexNumber(String number) {
        int numberFirst = 0;
        int indexOperator = 1;
        int numberSecond = 2;

        try {
            String[] numbers = number.split(" ");
            if (numbers.length == 3) {
                validNumber = Float.parseFloat(numbers[numberFirst]);
                operator = numbers[indexOperator];
                if (operator.equals("+")) {
                    imaginaryNumber = Float.parseFloat(numbers[numberSecond].replace("i", ""));
                    return true;
                }
                if (operator.equals("-")) {
                    imaginaryNumber = Float.parseFloat(numbers[numberSecond].replace("i", ""));
                    imaginaryNumber *= -1;
                    return true;
                }
                else {
                    throw new RuntimeException();
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
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
        if (validNumber == 0 && imaginaryNumber != 0) {
            return String.format("z = %.2fi" , imaginaryNumber);
        } else if (imaginaryNumber == 0 && validNumber != 0) {
            return String.format("z = %.2fi", validNumber);
        } else if (operator.equals("-")) {
            return String.format("z = %.2f %s %.2fi", validNumber, operator, imaginaryNumber * -1);
        } else if (validNumber == 0 && imaginaryNumber == 0) {
            return String.format("z = %.2f + %.2fi", validNumber, imaginaryNumber);
        } else {
            return String.format("z = %.2f %s %.2fi", validNumber, operator, imaginaryNumber);
        }
    }
}












