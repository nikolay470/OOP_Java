package DZ.seminar_3;
import java.util.List;
public class Controller {
    private static FlowService service = new FlowService();
    public static void sortFlows(List<Flow> list) {
        service.sortFlows(list);
    }
}
