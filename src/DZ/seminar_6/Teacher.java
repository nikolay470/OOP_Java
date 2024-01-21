package DZ.seminar_6;

// реализованы принципы единственной ответственности,
// подстановки барбары лисков, разделение интерфейсов
public class Teacher extends Person implements Comparable<Teacher>{
    private Integer experience;
    private Integer category;
    private final String specialization;

    public Teacher(
            String name, String surname,
            Integer age, Integer experience,
            Integer category, String specialization
    )
    {
        super(name, surname, age);
        this.experience = experience;
        this.category = category;
        this.specialization = specialization;
    }


    public Integer getExperience() {
        return this.experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getCategory() {
        return this.category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getInfo() {
        return String.format(
                "Учитель\nИмя: %s\nФамилия: %s\nВозраст: %d\n" +
                "Стаж: %d\nКатегория: %d\nНаправление: %s\n",
                this.getName(), this.getSurname(), this.getAge(),
                this.getExperience(), this.getCategory(), this.getSpecialization()
        );
    }

    @Override
    public int compareTo(Teacher teacher) {
        return this.getSurname().charAt(0) - teacher.getSurname().charAt(0);
    }

    public String toString() {
        return String.format(
                "%s %s",
                this.getSurname(), this.getName()
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher teacher = (Teacher) obj;
            return (
                    this.getName().equals(teacher.getName())
                    && this.getSurname().equals(teacher.getSurname())
                    && this.getAge().equals(teacher.getAge())
                    && this.getExperience().equals(teacher.getExperience())
                    && this.getCategory().equals(teacher.getCategory())
                    && this.getSpecialization().equals(teacher.getSpecialization())
            );
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (
                (this.getName().hashCode() +
                this.getSurname().hashCode() +
                this.getAge().hashCode() +
                this.getExperience().hashCode() +
                this.getCategory().hashCode() +
                this.getSpecialization().hashCode()) >> 4
                );
    }
}





















