package DZ.seminar_6.interfaces;
import DZ.seminar_6.Teacher;

public interface IControllerTeacher {
    Teacher createTeacher(String name, String surname,
                          Integer age, Integer experience,
                          Integer category, String specialization);

    void edit(Teacher object);
}
