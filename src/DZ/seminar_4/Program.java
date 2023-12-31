package DZ.seminar_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        Teacher teacher1 = controller.createTeacher(
                "Нина", "Федорова", 35,
                10, 2, "русский язык / литература"
        );
        Teacher teacher2 = controller.createTeacher(
                "Елена", "Линева", 27,
                2, 3, "история"
        );
        Teacher teacher3 = controller.createTeacher(
                "Олег", "Панакотов", 40,
                15, 1, "математика"
        );
        Teacher teacher4 = controller.createTeacher(
                "Александр ", "Никонов", 43,
                12, 2, "труд"
        );
        Teacher teacher5 = controller.createTeacher(
                "Алевтина", "Сормовская", 30,
                5, 1, "право"
        );
        Teacher teacher6 = controller.createTeacher(
                "Алексей", "Топилин", 31,
                6, 1, "физическая культура"
        );

        ArrayList<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(teacher1);
        listTeachers.add(teacher2);
        listTeachers.add(teacher3);
        listTeachers.add(teacher4);
        listTeachers.add(teacher5);
        listTeachers.add(teacher6);

        System.out.println("Информация об учителе --->");
        System.out.println(teacher3.getInfo());

        System.out.println("Список учителей --->");
        System.out.println("------------");
        controller.printList(listTeachers);
        System.out.println("------------");

        System.out.println("Изменение данных об учителе --->");
        Scanner input = new Scanner(System.in);
        int name = 1;
        int surname = 0;
        System.out.println("Введите фамилию и имя учителя через пробел");
        String[] dataOfTeacher = input.nextLine().split(" ");
        for (Teacher teacher : listTeachers) {
            if (teacher.getName().equalsIgnoreCase(dataOfTeacher[name])
                    && teacher.getSurname().equalsIgnoreCase(dataOfTeacher[surname]))
            {
                controller.edit(teacher);
            }
        }
    }
}
