package DZ.seminar_3.Comparators;

import DZ.seminar_3.Flow;
import java.util.Comparator;

public class FlowComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow first, Flow second) {
        return first.getQuantGroup() - second.getQuantGroup();
    }
}
