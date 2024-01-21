package DZ.seminar_6.interfaces;

import DZ.seminar_6.Person;
import java.util.List;

public interface IPrinterPerson {
    void print(Person person);
    void printList(List<? extends Person> list);
}
