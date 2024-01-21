package DZ.seminar_4;


// реализуем принцип открытости - закрытости
public class EditorTeacher extends EditorPerson{
    public void editExperience(int experience, Teacher teacher) {
        teacher.setExperience(experience);
    }

    public void editCategory(int category, Teacher teacher) {
        teacher.setCategory(category);
    }
}
