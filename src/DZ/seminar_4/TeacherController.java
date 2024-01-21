package DZ.seminar_4;
import DZ.seminar_4.interfaces.Controller;

import java.util.Scanner;
import java.util.List;

public class TeacherController implements Controller<Teacher> {
    public Teacher createTeacher(
            String name, String surname,
            Integer age, Integer experience,
            Integer category, String specialization
    )
    {
        return new Teacher(name, surname, age, experience, category, specialization);
    }

    private void print(Teacher object) {
        System.out.println(object.getInfo());
    }

    @Override
    public void edit(Teacher object) {
        Scanner input = new Scanner(System.in);
        boolean iteration = true;
        String value;
        String errorMessage = "Введено некоректное значение";

        while (iteration) {
            System.out.println(
                            "Какой параметр вы хотите отредактировать ?\n" +
                            "1. Имя\n2. Фамилия\n3. Возраст\n4. Стаж\n5. Категория\n6. Завершить"
            );
            int command = input.nextInt();
            input.nextLine();

            if (command == 1) {
                System.out.println("Введите новое значение");
                value = input.nextLine();
                object.setName(value);
            } else if (command == 2) {
                System.out.println("Введите новое значение");
                value = input.nextLine();
                object.setSurname(value);
            } else if (command == 3) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    object.setAge(Integer.parseInt(value));
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 4) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    object.setExperience(Integer.parseInt(value));
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 5) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    object.setCategory(Integer.parseInt(value));
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 6) {
                iteration = false;
            }
        }
        print(object);
    }

    @Override
    public void printList(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
