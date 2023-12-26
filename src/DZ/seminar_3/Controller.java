package DZ.seminar_3;
import java.util.List;
public class Controller {
    /**
     * класс для сортировки списка потоков
     * поля:
     * static service - экземпляр класса FlowService,
     * который содержит метод сортировки потоков с использованием
     * экземпляра класса FlowComporator
     */
    private static FlowService service = new FlowService();
    public static void sortFlows(List<Flow> list) {
        // метод сортировки списка потоков
        service.sortFlows(list);
    }
}
