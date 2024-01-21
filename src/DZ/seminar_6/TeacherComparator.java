package DZ.seminar_6;

import java.util.Comparator;

// реализованы принципы единственной ответственности,
// открытости - закрытости, инверсии зависимостей, разделение интерфейсов
public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher first, Teacher second) {
        return first.getCategory() - second.getCategory();
    }
}
