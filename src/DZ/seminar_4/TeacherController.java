package DZ.seminar_4;
import DZ.seminar_4.interfaces.IControllerTeacher;

import java.util.List;

// принцип единственной ответственности,
// принцип открытости - закрытости
// принцип инверсии зависимостей

public class TeacherController implements IControllerTeacher {
    private EditorTeacher editorTeacher = new EditorTeacher();
    private PrinterPerson printerPerson = new PrinterPerson();
    @Override
    public Teacher createTeacher(
            String name, String surname,
            Integer age, Integer experience,
            Integer category, String specialization
    )
    {
        return new Teacher(name, surname, age, experience, category, specialization);
    }

    private void print(Teacher object) {
        printerPerson.print(object);
    }

    @Override
    public void edit(Teacher object) {
        editorTeacher.edit(object);
        printerPerson.print(object);
    }

    public void printList(List<Teacher> list) {
        printerPerson.printList(list);
    }
}
