package DZ.seminar_7.finalDZ.model;

public class Model {
    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    public ServiceForComplexNum service;
    private static Model model;

    private Model() {
        firstNumber = new ComplexNumber();
        secondNumber = new ComplexNumber();
        service = new ServiceForComplexNum();
    }

    public ComplexNumber getFirstNumber() {
        return firstNumber;
    }
    public ComplexNumber getSecondNumber() {
        return secondNumber;
    }
    public static Model getModel() {
        if (model == null) {
            model = new Model();
            return model;
        } return model;
    }
}
