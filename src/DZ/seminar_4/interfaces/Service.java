package DZ.seminar_4.interfaces;

import java.util.Comparator;
import java.util.List;

public interface Service<T> {
    void sortList(List<T> list);
    void sortList(List<T> list, Comparator comparator);
}
