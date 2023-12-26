package DZ.seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import DZ.seminar_3.Comparators.ReverseSortOfDate;

public class Program {
    public static void main(String[] args) {
        // создаем студенческие группы
        StudyGroup group1 = new StudyGroup("frontend-developer 28", "19-05-2022", 28);
        StudyGroup group2 = new StudyGroup("java-developer 43", "07-11-2023", 35);
        StudyGroup group3 = new StudyGroup("backend-developer 28", "19-05-2022", 25);
        StudyGroup group4 = new StudyGroup("java-developer 42", "11-07-2022", 31);
        StudyGroup group5 = new StudyGroup("golang-developer 5", "23-09-2023", 19);
        // создаем потоки по несколько групп
        Flow flow1 = new Flow();
        flow1.addGroup(group1);
        flow1.addGroup(group2);
        flow1.addGroup(group3);
        flow1.addGroup(group4);
        flow1.addGroup(group5);


        Flow flow2 = new Flow();
        flow2.addGroup(group1);
        flow2.addGroup(group4);
        flow2.addGroup(group5);


        Flow flow3 = new Flow();
        flow3.addGroup(group1);
        flow3.addGroup(group2);
        flow3.addGroup(group3);


        Flow flow4 = new Flow();
        flow4.addGroup(group2);
        flow4.addGroup(group3);
        flow4.addGroup(group4);
        flow4.addGroup(group5);

        // создаем список потоков
        ArrayList<Flow> listFlows = new ArrayList<>();
        listFlows.add(flow1);
        listFlows.add(flow2);
        listFlows.add(flow3);
        listFlows.add(flow4);


        System.out.println("Сортировка групп в потоке по дате формирования (по возрастанию)");
        System.out.println(flow1.toString());
        Collections.sort(flow1.getListGroups());
        System.out.println(flow1 + "\n");


        System.out.println("Соровка групп в потоке по дате формирования (по убыванию)");
        Collections.sort(flow1.getListGroups(), new ReverseSortOfDate());
        System.out.println(flow1 + "\n");


        System.out.println("Сортировка потоков по колличеству групп (по возрастанию)");
        for (Flow listFlow : listFlows) {
            System.out.println(listFlow.toString());
        }
        System.out.println();
        Controller.sortFlows(listFlows);
        for (Flow listFlow : listFlows) {
            System.out.println(listFlow.toString());
        }
        System.out.println();


        System.out.println("Перебор потока при помощи цикла for-each");
        for (StudyGroup group : flow3) {
            System.out.println(group);
        }
        System.out.println();


        System.out.println("Создание экземпляра класса типа Iterator\n"
                            +"и перебор потока при помощи этого экземпляра");
        Iterator<StudyGroup> iterator = flow4.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        System.out.println("Удаление группы из потока с использованием итератора");
        while (iterator.hasNext()) {
            StudyGroup group = iterator.next();
            if (group.getName().equals("backend-developer 28")) {
                iterator.remove();
            }
        }
        System.out.println(flow4.getListGroups() + "\n");


        System.out.println("Добавление группы в поток");
        flow4.addGroup(group1);
        System.out.println(flow4.getListGroups());
    }
}
