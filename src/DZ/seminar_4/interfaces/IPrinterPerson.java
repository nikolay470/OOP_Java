package DZ.seminar_4.interfaces;

import DZ.seminar_4.Person;
import java.util.List;

public interface IPrinterPerson {
    String print(Person person);
    String printList(List<? extends Person> list);
}
