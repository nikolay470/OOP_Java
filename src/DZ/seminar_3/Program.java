package DZ.seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import DZ.seminar_3.Comparators.ReverseSortOfDate;

public class Program {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("frontend-developer 28", "19-05-2022", 28);
        StudyGroup group2 = new StudyGroup("java-developer 43", "07-11-2023", 35);
        StudyGroup group3 = new StudyGroup("backend-developer 28", "19-05-2022", 25);
        StudyGroup group4 = new StudyGroup("java-developer 42", "11-07-2022", 31);
        StudyGroup group5 = new StudyGroup("golang-developer 5", "23-09-2023", 19);

        Flow flow1 = new Flow();
        flow1.addGroup(group1);
        flow1.addGroup(group2);
        flow1.addGroup(group3);
        flow1.addGroup(group4);
        flow1.addGroup(group5);
        System.out.println(flow1.getQuantGroup());

        Flow flow2 = new Flow();
        flow2.addGroup(group1);
        flow2.addGroup(group4);
        flow2.addGroup(group5);
        System.out.println(flow2.getQuantGroup());

        Flow flow3 = new Flow();
        flow3.addGroup(group1);
        flow3.addGroup(group2);
        flow3.addGroup(group3);
        System.out.println(flow3.getQuantGroup());

        Flow flow4 = new Flow();
        flow4.addGroup(group2);
        flow4.addGroup(group3);
        flow4.addGroup(group4);
        flow4.addGroup(group5);
        System.out.println(flow4.getQuantGroup());

        ArrayList<Flow> listFlows = new ArrayList<>();
        listFlows.add(flow1);
        listFlows.add(flow2);
        listFlows.add(flow3);
        listFlows.add(flow4);

        System.out.println(flow1.toString());
        Collections.sort(flow1.getListGroup());
        System.out.println(flow1 + "\n");
        System.out.println("------------------");
        Collections.sort(flow1.getListGroup(), new ReverseSortOfDate());
        System.out.println(flow1 + "\n");

        for (Flow listFlow : listFlows) {
            System.out.println(listFlow.toString());
        }
        System.out.println();
        Controller.sortFlows(listFlows);
        for (Flow listFlow : listFlows) {
            System.out.println(listFlow.toString());
        }
        System.out.println();

        for (StudyGroup group : flow3) {
            System.out.println(group);
        }
        System.out.println();

        Iterator<StudyGroup> iterator = flow4.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        while (iterator.hasNext()) {
            StudyGroup group = iterator.next();
            if (group.getName().equals("backend-developer 28")) {
                iterator.remove();
            }
        }
        System.out.println(flow4.getListGroup());

        flow4.addGroup(group1);
        System.out.println(flow4.getListGroup());
    }
}
