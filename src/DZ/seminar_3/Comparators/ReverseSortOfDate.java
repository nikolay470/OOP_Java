package DZ.seminar_3.Comparators;

import DZ.seminar_3.StudyGroup;

import java.util.Comparator;

class ReverseSortOfDate implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup first, StudyGroup second) {
        return second.getDataOfFormation().getYear() - first.getDataOfFormation().getYear();
    }
}
