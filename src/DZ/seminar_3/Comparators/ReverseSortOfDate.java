package DZ.seminar_3.Comparators;

import DZ.seminar_3.StudyGroup;

import java.util.Comparator;

public class ReverseSortOfDate implements Comparator<StudyGroup> {
    // класс содержащий метод для сортировки групп по дате формирования (по убыванию)
    @Override
    public int compare(StudyGroup first, StudyGroup second) {
        int resultYear = second.getDataOfFormation().getYear() - first.getDataOfFormation().getYear();
        if (resultYear == 0) {
            int resultMonth = second.getDataOfFormation().getMonthValue() - first.getDataOfFormation().getMonthValue();
            if (resultMonth == 0) {
                int resultDay = second.getDataOfFormation().getDayOfMonth() -
                        first.getDataOfFormation().getDayOfMonth();
                return resultDay;
            }
            return resultMonth;
        }
        return resultYear;
    }
}
