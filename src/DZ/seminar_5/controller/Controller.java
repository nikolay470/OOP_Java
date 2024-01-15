package DZ.seminar_5.controller;

import DZ.seminar_5.model.Student;
import DZ.seminar_5.model.Teacher;
import DZ.seminar_5.service.DataService;
import DZ.seminar_5.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    private DataService service = new DataService();
    private View view = new View();
    private HashMap<String, String> data;
    private int command;
    private boolean flagIteration = true;

    public void start() {
        while (flagIteration) {
            command = view.getChoice();
            if (command >= 1 && command <= 7) {
                if (command == 1) {
                    data = view.getDataOfStudent();
                    service.createStudent(
                            data.get("name"), data.get("surname"),
                            Integer.parseInt(data.get("age")),
                            data.get("faculty")
                    );
                    data = null;
                    view.printUser(
                            service.getListStudent().get(service.getQuantStudent() - 1)
                    );
                } else if (command == 2) {
                    data = view.getDataOfTeacher();
                    service.createTeacher(
                            data.get("name"), data.get("surname"),
                            Integer.parseInt(data.get("age")),
                            data.get("objectTeaching"),
                            Integer.parseInt(data.get("experience"))
                    );
                    data = null;
                    view.printUser(
                            service.getListTeacher().get(service.getQuantTeacher() - 1)
                    );
                } else if (command == 3) {
                    String searchOfSurname = view.getSurnameUser();
                    ArrayList<Student> findStudents = service.searchStudent(searchOfSurname);
                    for (int i = 0; i < findStudents.size(); i++) {
                        view.printUser(findStudents.get(i));
                    }
                } else if (command == 4) {
                    String searchOfSurname = view.getSurnameUser();
                    ArrayList<Teacher> findTeachers = service.searchTeacher(searchOfSurname);
                    for (int i = 0; i < findTeachers.size(); i++) {
                        view.printUser(findTeachers.get(i));
                    }
                } else if (command == 5) {
                    view.printList(service.getListStudent());
                } else if (command == 6) {
                    view.printList(service.getListTeacher());
                } else if (command == 7) {
                    flagIteration = false;
                }
            } else {
                System.out.println("Введен некоректный номер действия");
            }
        }
    }
}
