package DZ.seminar_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;

public class StudyGroup implements Comparable<StudyGroup>{
    /**
     * класс представляет студенческую группу
     * поля:
     * String name - название группы
     * Integer quantStudents - колличество студентов
     * LocalDate dataOfFormation - дата формирования группы
     * DateTimeFormatter formatter - формат даты в котором нужно передавать дату формирования группы
     */
    private String name;
    private Integer quantStudents;
    private LocalDate dataOfFormation;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public StudyGroup(String name, String dataOfFormation, Integer quantStudents) {
        this.name = name;
        try {
            this.dataOfFormation = LocalDate.parse(dataOfFormation, formatter);
        } catch (DateTimeParseException exception) {
            System.out.println(
                    "Введен некоректный формат даты.\n"
                    +"Формат должен быть следующим \"dd-MM-yyyy\""
            );
        }
        this.quantStudents = quantStudents;
    }

    public String getName() {
        return this.name;
    }
    public Integer getQuantStudents() {
        return this.quantStudents;
    }
    public LocalDate getDataOfFormation() {
        return this.dataOfFormation;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public void setQuantStudents(Integer plusOrMinusQuantSudents) {
        this.quantStudents += plusOrMinusQuantSudents;
    }
    @Override
    public int compareTo(StudyGroup group) {
        /**
         * метод реализует способ сравнения экземпляров этого класса по умолчанию для сортировки
         */
        int resultYear = this.dataOfFormation.getYear() - group.getDataOfFormation().getYear();
        if (resultYear == 0) {
            int resultMonth = this.dataOfFormation.getMonthValue() - group.getDataOfFormation().getMonthValue();
            if (resultMonth == 0) {
                int resultDay = this.dataOfFormation.getDayOfMonth() -
                                    group.getDataOfFormation().getDayOfMonth();
                return resultDay;
            }
            return resultMonth;
        }
        return resultYear;
    }
    public String getInfo() {
        /**
         *  инфориация об студенческой группе
         */
        return String.format(
                "Группа %s\nДата формирования %d-%d-%d\nКолличество студентво %d\n",
                this.name, this.dataOfFormation.getDayOfMonth(), this.dataOfFormation.getMonth(),
                this.dataOfFormation.getYear(), this.quantStudents
        );
    }
    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        /**
         * метод реализует сравнение двух студенческих групп
         */
        if (obj instanceof StudyGroup) {
            StudyGroup newObj = (StudyGroup) obj;
            return (this.name.equals(newObj.getName())
                    && this.dataOfFormation.equals(newObj.getDataOfFormation())
                    && this.quantStudents.equals(newObj.getQuantStudents()));
        }
        return false;
    }
    @Override
    public int hashCode() {
        return ((this.name.hashCode() +
                this.dataOfFormation.hashCode() +
                this.quantStudents.hashCode()) >> 4);
    }
}




















