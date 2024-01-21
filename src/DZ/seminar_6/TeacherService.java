package DZ.seminar_6;

import DZ.seminar_6.interfaces.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// реализованы принципы единственной ответственности,
// открытости - закрытости, инверсии зависимостей, разделение интерфейсов
public class TeacherService implements Service<Teacher> {
    @Override
    public void sortList(List<Teacher> list) {
        Collections.sort(list);
    }
    @Override
    public void sortList(List<Teacher> list, Comparator comparator) {
        list.sort(comparator);
    }
}
