package DZ.seminar_3;

import DZ.seminar_3.Comparators.FlowComparator;

import java.util.List;
import java.util.Collections;

public class FlowService {
    //класс содержащий метод сортировки списка потоков

    /**
     * метод void sortFlows - метод для сортировки списка потоков с испольованием компоратора
     * @param coll - коллекция потоков типа List<Flow>
     */
    public void sortFlows(List<Flow> coll) {
            Collections.sort(coll, new FlowComparator());
    }
}
