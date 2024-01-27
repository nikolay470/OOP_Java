package DZ.seminar_7.finalDZ.view;

import java.util.ArrayList;
import java.util.Scanner;;

public class View {
    private static View view;
    private GetData getData;
    private Printer printer;

    private View() {
        getData = new GetData();
        printer = new Printer();
    }

    public static View getView() {
        if (view == null) {
            view = new View();
            return view;
        } return view;
    }

    public GetData getData() {
        return getData;
    }

    public Printer printer() {
        return printer;
    }
}
