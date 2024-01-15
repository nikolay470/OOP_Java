package DZ.seminar_5.model;

import DZ.seminar_5.model.abstractClass.User;

public class Teacher extends User {
    private final String objectTeaching;
    private int experience;

    public Teacher(
            String name, String surname, int age, String objectTeaching, int experience
    )
    {
        super(name, surname, age);
        this.objectTeaching = objectTeaching;
        this.experience = experience;
    }

    public String getObjectTeaching() {
        return objectTeaching;
    }

    public int getExperience() {
        return experience;
    }

    public boolean setExperience(int experience) {
        if (experience >= 1 && experience <= 60) {
            this.experience = experience;
            return true;
        } return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher teacherObj = (Teacher) obj;
            return (this.getName().equals(teacherObj.getName())
                    && this.getSurname().equals(teacherObj.getSurname())
                    && this.getAge() == teacherObj.getAge()
                    && this.getObjectTeaching().equals(teacherObj.getObjectTeaching())
                    && this.getExperience() == teacherObj.getExperience());
        } return false;
    }

    @Override
    public String toString() {
        return String.format(
                "Учитель.\nИмя: %s\nФамилия: %s\nВозраст: %d\nПредмет: %s\nСтаж: %d\n",
                this.getName(), this.getSurname(), this.getAge(),
                this.getObjectTeaching(), this.getExperience()
        );
    }

    @Override
    public int hashCode() {
        return ((this.getName().hashCode() + this.getSurname().hashCode()
                + this.getAge() + this.getObjectTeaching().hashCode()
                + this.getExperience()) >> 4);
    }
}














