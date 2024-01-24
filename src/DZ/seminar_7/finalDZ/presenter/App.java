package DZ.seminar_7.finalDZ.presenter;

import DZ.seminar_7.finalDZ.model.ComplexNumber;
import DZ.seminar_7.finalDZ.presenter.interfaces.IApp;
import DZ.seminar_7.finalDZ.view.View;
import DZ.seminar_7.finalDZ.model.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class App implements IApp {
    private Model model = Model.getModel();
    private View view = View.getView();
    private int firstNum = 0;
    private int secondNum = 2;
    private int operator = 1;
    private ComplexNumber result;
    ArrayList<String> data = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    private boolean iteration = true;

    @Override
    public void start() {
        while (iteration) {
            System.out.println("Начинаем вычисления? [Y / N]");
            String cmd = in.nextLine();
            if (cmd.equalsIgnoreCase("N")) {
                iteration = false;
            } else {
                data = view.getData.inputData();
                model.getFirstNumber().initializationComplexNumber(data.get(firstNum));
                model.getSecondNumber().initializationComplexNumber(data.get(secondNum));

                if (data.get(operator).equals("+")) {
                    result = model.service.sum(model.getFirstNumber(), model.getSecondNumber());
                } else if (data.get(operator).equals("-")) {
                    result = model.service.subtraction(
                            model.getFirstNumber(), model.getSecondNumber()
                    );
                } else if (data.get(operator).equals("*")) {
                    result = model.service.multipliucation(
                            model.getFirstNumber(), model.getSecondNumber()
                    );
                } else if (data.get(operator).equals("/")) {
                    result = model.service.division(
                            model.getFirstNumber(), model.getSecondNumber()
                    );
                }
                view.printer.printResult(result);
            }
        }
    }
}
