package DZ.seminar_3;

import DZ.seminar_3.Comparators.FlowComparator;

import java.util.List;
import java.util.Collections;

public class FlowService<T> {
    public void sortFlows(T coll) {
        if (coll instanceof List) {
            List newColl = (List) coll;
            Collections.sort(newColl, new FlowComparator());
        }
    }
}
