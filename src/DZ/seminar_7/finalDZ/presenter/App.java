package DZ.seminar_7.finalDZ.presenter;

import DZ.seminar_7.finalDZ.Logger;
import DZ.seminar_7.finalDZ.model.ComplexNumber;
import DZ.seminar_7.finalDZ.presenter.interfaces.IApp;
import DZ.seminar_7.finalDZ.view.View;
import DZ.seminar_7.finalDZ.model.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App implements IApp {
    private Model model = Model.getModel();
    private View view = View.getView();
    private final Logger logger = new Logger("src/DZ/seminar_7/finalDZ/log.txt");
    private final int firstNum = 0;
    private final int secondNum = 2;
    private final int operator = 1;
    private ComplexNumber result;
    ArrayList<String> data = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    private boolean iteration = true;

    public App() throws IOException {
    }

    @Override
    public void start() {
        while (iteration) {
            System.out.println("Начинаем вычисления? [Y / N]");
            String cmd = in.nextLine();
            if (cmd.equalsIgnoreCase("N")) {
                iteration = false;
            } else if (cmd.equalsIgnoreCase("Y")) {
                while (iteration) {
                    data = view.getData().inputData();
                    logger.writeInputData(data);
                    boolean isInitFirst = model.getFirstNumber().initializationComplexNumber(data.get(firstNum));
                    boolean isInitSecond = model.getSecondNumber().initializationComplexNumber(data.get(secondNum));
                    if (isInitFirst && isInitSecond) {
                        iteration = false;
                    } else {
                        view.printer().printInputError();
                    }
                }

                iteration = true;
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
                logger.writeLog(result);
                view.printer().printResult(result);
            } else {
                System.out.println("Вы ввели некоректный ответ.");
                System.out.println("Введите букву \"y\"(да) или \"n\"(нет).\n");
            }
        }
    }
}
