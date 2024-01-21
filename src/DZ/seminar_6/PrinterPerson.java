package DZ.seminar_6;

import DZ.seminar_6.interfaces.IPrinterPerson;

import java.util.List;


// реализованы принципы единственной ответственности,
// разделения интерфейсов, инверсия зависимостей, открытости закрытости
public class PrinterPerson implements IPrinterPerson {

    @Override
    public void print(Person person) {
        System.out.println(person.getInfo());
    }

    @Override
    public void printList(List<? extends Person> list) {
        for (Person person : list) {
            System.out.println(person.toString() + ",\n");
        }
    }
}
