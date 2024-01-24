package DZ.seminar_7.finalDZ.view;

import DZ.seminar_7.finalDZ.model.ComplexNumber;
import DZ.seminar_7.finalDZ.view.interfaces.IPrinterComplexNum;

public class Printer implements IPrinterComplexNum {
    public void printResult(ComplexNumber number) {
        System.out.println("Итоговый результат: " + number);
    }

}
