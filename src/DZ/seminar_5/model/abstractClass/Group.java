package DZ.seminar_5.model.abstractClass;

import DZ.seminar_5.model.Student;
import DZ.seminar_5.model.Teacher;

import java.util.ArrayList;

public abstract class Group {
    private Teacher teacher;
    private ArrayList<Student> studentsGroup;
    private String faculty;
    private int numberGroup;

    public Group(
            Teacher teacher,
            ArrayList<Student> students,
            String faculty,
            int numberGroup
    )
    {
        this.teacher = teacher;
        this.studentsGroup = students;
        this.numberGroup = numberGroup;
        this.faculty = faculty;
    }

    public abstract String getInfo();

    public abstract void addStudent(Student student);

    public abstract void removeStudent(Student student);

    public abstract void changedTutor(Teacher teacher);

    public abstract void printStudentsInGroup();

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    protected ArrayList<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public int getQuantStudents() {
        return studentsGroup.size();
    }
}
