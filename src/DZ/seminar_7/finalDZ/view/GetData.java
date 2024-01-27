package DZ.seminar_7.finalDZ.view;

import java.util.ArrayList;
import java.util.Scanner;

public class GetData {
    private Scanner in = new Scanner(System.in);
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
        String input = in.nextLine();
        return input;
    }
    public String inputOperator() {
        boolean iteration = true;
        int cmd = 0;
        while (iteration) {
            System.out.println("Введите действие: ");
            System.out.println(
                    "1. Сложить\n2. Вычесть\n"
                            + "3. Умножить\n4. Разделить"
            );
            try {
                cmd = Integer.parseInt(in.nextLine());
                if (cmd < 1 || cmd > 4) {
                    throw new RuntimeException();
                }
                iteration = false;
            } catch (RuntimeException e) {
                System.out.println("Вы ввели некоректный номер действия.");
                System.out.println("Пожалуйста введите число от 1 до 4.\n");
            }
        }
        if (cmd == 1) {
            return "+";
        }
        if (cmd == 2) {
            return "-";
        }
        if(cmd == 3) {
            return "*";
        } else {
            return "/";
        }
    }
}
