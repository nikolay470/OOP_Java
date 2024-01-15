package DZ.seminar_5.model;

import DZ.seminar_5.model.abstractClass.Group;

import java.util.ArrayList;

public class StudyGroup extends Group {
    public StudyGroup(
                      Teacher teacher,
                      ArrayList<Student> students,
                      String faculty,
                      int numberGroup
    )
    {
        super(teacher, students, faculty, numberGroup);
    }
    @Override
    public String getInfo() {
        return String.format(
                "Группа.\nКуратор: %s %s\nНомер группы: %d\n"
                + "Факультет: %s\nКолличество студентов: %d\n",
                this.getTeacher().getSurname(), this.getTeacher().getName(),
                this.getNumberGroup(), this.getFaculty(), this.getQuantStudents()
        );
    }

    @Override
    public void addStudent(Student student) {
        student.setGroup(this);
        this.getStudentsGroup().add(student);
    }

    @Override
    public void removeStudent(Student student) {
        student.setGroup(null);
        this.getStudentsGroup().remove(student);
    }

    @Override
    public void changedTutor(Teacher teacher) {
        this.setTeacher(teacher);
    }

    @Override
    public void printStudentsInGroup() {
        for (Student student : this.getStudentsGroup()) {
            System.out.printf(
                    "%s %s,\n",
                    student.getSurname(), student.getName()
            );
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudyGroup) {
            StudyGroup groupObj = (StudyGroup) obj;
            return (this.getTeacher().equals(groupObj.getTeacher())
                    && this.getStudentsGroup().equals(groupObj.getStudentsGroup())
                    && this.getFaculty().equals(groupObj.getFaculty())
                    && this.getNumberGroup() == this.getNumberGroup());
        } return false;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - %d",
                this.getFaculty(), this.getNumberGroup()
        );
    }

    @Override
    public int hashCode() {
        return ((this.getTeacher().hashCode()
                + this.getStudentsGroup().hashCode()
                + this.getFaculty().hashCode()
                + this.getNumberGroup()) >> 4);
    }
}








