package DZ.seminar_4.interfaces;
import java.util.List;
public interface Controller<T> {
    void edit(T object);
    void printList(List<T> list);
}
