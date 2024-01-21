package DZ.seminar_4.interfaces;

import DZ.seminar_4.Person;
import java.util.List;

public interface IPrinterPerson {
    void print(Person person);
    void printList(List<? extends Person> list);
}
