package DZ.seminar_6.interfaces;

import DZ.seminar_6.Person;

public interface IEditorPerson {
    void editName(String name, Person person);
    void editSurname(String surname, Person person);
    void editAge(int age, Person person);
}
