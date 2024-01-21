package DZ.seminar_4;

import DZ.seminar_4.interfaces.IEditorPerson;


// реализованы принципы единственной ответственности,
// разделения интерфейсов, инверсии зависимостей, открытости - закрытости
public class EditorPerson implements IEditorPerson {

    @Override
    public void editName(String name, Person person) {
        person.setName(name);
    }

    @Override
    public void editSurname(String surname, Person person) {
        person.setSurname(surname);
    }

    @Override
    public void editAge(int age, Person person) {
        person.setAge(age);
    }
}
