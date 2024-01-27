package DZ.seminar_7.finalDZ.view;

import DZ.seminar_7.finalDZ.model.ComplexNumber;
import DZ.seminar_7.finalDZ.view.interfaces.IPrinterComplexNum;

public class Printer implements IPrinterComplexNum {
    public void printResult(ComplexNumber number) {
        System.out.println("Итоговый результат: " + number);
    }
    public void printInputError() {
        System.out.println("Вы ввели комплексное число в некоректной форме.");
        System.out.println("Необходимо ввести в формате (a + bi) или (a - bi)");
        System.out.println("Значение a может быть отрицательным.\n");
    }
}
