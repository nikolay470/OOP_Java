package DZ.seminar_5.model;

import DZ.seminar_5.model.abstractClass.User;

public class Student extends User {
    private StudyGroup group;
    private String faculty;

    public Student(String name, String surname, int age, String faculty) {
        super(name, surname, age);
        this.faculty = faculty;
        this.group = null;
    }

    public StudyGroup getGroup() {
        return group;
    }

    public void setGroup(StudyGroup group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student studentObj = (Student) obj;
            return (this.getName().equals(studentObj.getName())
                    && this.getSurname().equals(studentObj.getSurname())
                    && this.getAge() == studentObj.getAge()
                    && this.getGroup().equals(studentObj.getGroup())
                    && this.getFaculty().equals(studentObj.getFaculty()));
        } return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Студент.\nИмя: %s\nФамилия: %s\nВозраст: %d\nГруппа: %s\nФакультет: %s\n",
                this.getName(), this.getSurname(),
                this.getAge(), this.getGroup(),this.getFaculty()
        );
    }

    @Override
    public int hashCode() {
        return ((this.getName().hashCode() + this.getSurname().hashCode()
                + this.getAge() + this.getGroup().hashCode()
                + this.getFaculty().hashCode()) >> 4);
    }
}
