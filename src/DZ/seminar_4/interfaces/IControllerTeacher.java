package DZ.seminar_4.interfaces;
import DZ.seminar_4.Teacher;

public interface IControllerTeacher {
    Teacher createTeacher(String name, String surname,
                          Integer age, Integer experience,
                          Integer category, String specialization);

    void edit(Teacher object);
}
