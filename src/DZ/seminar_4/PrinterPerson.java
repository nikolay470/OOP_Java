package DZ.seminar_4;

import DZ.seminar_4.interfaces.IPrinterPerson;

import java.util.List;


// реализованы принципы единственной ответственности,
// разделения интерфейсов, инверсия зависимостей, открытости закрытости
public class Printer implements IPrinterPerson {

    @Override
    public String print(Person person) {
        return person.getInfo();
    }

    @Override
    public String printList(List<? extends Person> list) {
        StringBuilder result = new StringBuilder();
        for (Person person : list) {
            result.append(person.toString() + ",\n");
        }
        return result.toString();
    }
}
