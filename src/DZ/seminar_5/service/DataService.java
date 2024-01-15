package seminar_5.service;

import seminar_5.model.Student;
import seminar_5.model.Teacher;

import java.util.ArrayList;

public class DataService {
    private ArrayList<Student> listStudent = new ArrayList<>();
    private ArrayList<Teacher> listTeacher = new ArrayList<>();

    public ArrayList<Student> getListStudent() {
        return this.listStudent;
    }

    public ArrayList<Teacher> getListTeacher() {
        return this.listTeacher;
    }

    public int getQuantStudent() {
        return this.listStudent.size();
    }

    public int getQuantTeacher() {
        return this.listTeacher.size();
    }

    public boolean createStudent(
            String name, String surname, int age,
            String group, String faculty
    )
    {
        try {
            listStudent.add(new Student(
                    name, surname, age, group, faculty
            ));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public boolean createTeacher(
            String name, String surname, int age,
            String objectTeaching, int experience
            )
    {
        try {
            listTeacher.add(new Teacher(
               name, surname, age, objectTeaching, experience
            ));
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public void removeStudent(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.remove(i);
            }
        }
    }

    public void removeTeacher(int id) {
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                listTeacher.remove(i);
            }
        }
    }

    public ArrayList<Student> searchStudent(String surname) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getSurname().equalsIgnoreCase(surname)) {
                result.add(student);
            }
        }
        return result;
    }

    public ArrayList<Teacher> searchTeacher(String surname) {
        ArrayList<Teacher> result = new ArrayList<>();
        for (Teacher teacher : listTeacher) {
            if (teacher.getSurname().equalsIgnoreCase(surname)) {
                result.add(teacher);
            }
        }
        return result;
    }
}
