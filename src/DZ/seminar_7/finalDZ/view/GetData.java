package DZ.seminar_7.finalDZ.view;

import java.util.ArrayList;
import java.util.Scanner;

public class GetData {
    private Scanner in = new Scanner(System.in);
    private String input;
    private String messageFromFirstNumber =
            "Введите первое комплексное число в формате 'a + bi'";
    private String messageFromSecondNumber =
            "Введите второе комплексное число в формате 'a + bi'";

    public ArrayList<String> inputData() {
        ArrayList<String> result = new ArrayList<>();
        result.add(inputNumber(messageFromFirstNumber));
        result.add(inputOperator());
        result.add(inputNumber(messageFromSecondNumber));
        return result;
    }
    public String inputNumber(String message) {
        System.out.println(message);
        input = in.nextLine();
        return input;
    }
    public String inputOperator() {
        System.out.println("Введите действие");
        input = in.nextLine();
        return input;
    }
}
