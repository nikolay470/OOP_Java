package DZ.seminar_7.finalDZ.model;

import DZ.seminar_7.finalDZ.model.interfaces.IServiceForComplexNum;

public class ServiceForComplexNum implements IServiceForComplexNum {
    private float validNumber;
    private float imaginaryNumber;

    @Override
    public ComplexNumber sum(ComplexNumber first, ComplexNumber second) {
        validNumber = first.getValidNumber() + second.getValidNumber();
        imaginaryNumber = first.getImaginaryNumber() + second.getImaginaryNumber();
        return createComplexNum(validNumber, imaginaryNumber);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber first, ComplexNumber second) {
        validNumber = first.getValidNumber() - second.getValidNumber();
        imaginaryNumber = first.getImaginaryNumber() - second.getImaginaryNumber();
        return createComplexNum(validNumber, imaginaryNumber);
    }

    @Override
    public ComplexNumber division(ComplexNumber first, ComplexNumber second) {
        float denominator = second.getValidNumber() * second.getValidNumber()
                + second.getImaginaryNumber() * second.getImaginaryNumber();
        validNumber = (first.getValidNumber() * second.getValidNumber() +
                first.getImaginaryNumber() * second.getImaginaryNumber()) / denominator;
        imaginaryNumber = (first.getImaginaryNumber() * second.getValidNumber() +
                first.getValidNumber() * (second.getImaginaryNumber() * -1)) / denominator;
        return createComplexNum(validNumber, imaginaryNumber);
    }

    @Override
    public ComplexNumber multipliucation(ComplexNumber first, ComplexNumber second) {
        validNumber = (first.getValidNumber() * second.getValidNumber()) -
                (first.getImaginaryNumber() * second.getImaginaryNumber());
        imaginaryNumber = (first.getImaginaryNumber() * second.getValidNumber()) +
                (first.getValidNumber() * second.getImaginaryNumber());
        return createComplexNum(validNumber, imaginaryNumber);

    }

    private ComplexNumber createComplexNum(float first, float second) {
        return new ComplexNumber(first, second);
    }
}
