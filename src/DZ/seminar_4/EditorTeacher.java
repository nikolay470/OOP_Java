package DZ.seminar_4;


import java.util.Scanner;

// реализуем принцип открытости - закрытости
public class EditorTeacher extends EditorPerson{
    public void editExperience(int experience, Teacher teacher) {
        teacher.setExperience(experience);
    }

    public void editCategory(int category, Teacher teacher) {
        teacher.setCategory(category);
    }

    public void edit(Teacher object) {
        Scanner input = new Scanner(System.in);
        boolean iteration = true;
        String value;
        String errorMessage = "Введено некоректное значение";

        while (iteration) {
            System.out.println(
                    "Какой параметр вы хотите отредактировать ?\n"
                            + "1. Имя\n2. Фамилия\n3. Возраст\n4. Стаж\n5."
                            + "Категория\n6. Завершить"
            );
            int command = input.nextInt();
            input.nextLine();

            if (command == 1) {
                System.out.println("Введите новое значение");
                value = input.nextLine();
                editName(value, object);
            } else if (command == 2) {
                System.out.println("Введите новое значение");
                value = input.nextLine();
                editSurname(value, object);
            } else if (command == 3) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    editAge(Integer.parseInt(value), object);
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 4) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    editExperience(Integer.parseInt(value), object);
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 5) {
                try {
                    System.out.println("Введите новое значение");
                    value = input.nextLine();
                    editCategory(Integer.parseInt(value), object);
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            } else if (command == 6) {
                iteration = false;
            }
        }
    }
}
