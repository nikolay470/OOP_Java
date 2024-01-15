package DZ.seminar_5.view;

import DZ.seminar_5.model.StudyGroup;
import DZ.seminar_5.model.abstractClass.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class View {
    private Scanner input = new Scanner(System.in);

    public int getChoice() {
        System.out.println("Выберите действие:");
        System.out.println(
                "1. Создать студента\n2. Создать учителя\n"
                + "3. Получить информацию об студенте\n"
                + "4. Получить информацию об учителе\n"
                + "5. Показать список студентов\n"
                + "6. Показать список учителей\n"
                + "7. Создать учебную группу\n"
                + "8. Показать список групп\n"
                + "9. Выйти\n"
        );
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }

    public HashMap<String, String> getDataOfStudent() {
        HashMap<String, String> result = new HashMap<>();
        result.putAll(getNameSurnameAge());

        System.out.println("Введите группу");
        String group = input.nextLine();

        System.out.println("Введите факультет");
        String faculty = input.nextLine();

        result.put("group", group);
        result.put("faculty", faculty);

        return result;
    }

    public HashMap<String, String> getDataOfTeacher() {
        HashMap<String, String> result = new HashMap<>();
        result.putAll(getNameSurnameAge());

        System.out.println("Введите предмет");
        String objectTeaching = input.nextLine();

        System.out.println("Введите стаж");
        String experience = input.nextLine();

        result.put("objectTeaching", objectTeaching);
        result.put("experience", experience);

        return result;
    }

    private HashMap<String, String> getNameSurnameAge() {
        HashMap<String, String> result = new HashMap<>();
        System.out.println("Введите имя");
        String name = input.nextLine();

        System.out.println("Введите фамилию");
        String surname = input.nextLine();

        System.out.println("Введите возраст");
        String age = input.nextLine();

        result.put("name", name);
        result.put("surname", surname);
        result.put("age", age);

        return result;
    }

    public String getSurnameUser() {
        System.out.println("Введите фамилию");
        String surname = input.nextLine();
        return surname;
    }

    public void printUser(User user) {
        System.out.println("\n" + user);
    }

    public void printList(ArrayList<? extends User> listUser) {
        for (User user : listUser) {
            System.out.printf("\n%s %s\n",user.getName(), user.getSurname());
        }
    }
}











