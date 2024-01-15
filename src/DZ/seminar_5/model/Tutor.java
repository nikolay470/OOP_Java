package DZ.seminar_5.model;

public class Tutor {
    private Teacher teacher;
    private StudyGroup group;
    public Tutor(StudyGroup group) {
        this.teacher = group.getTeacher();
        this.group = group;
    }

    public String getInfo() {
        return teacher.toString() + "Курирует группу: " + group + "\n";
    }

    public String getInfoOfGroup() {
        return group.getInfo();
    }
}
