package DZ.seminar_7.finalDZ;

import DZ.seminar_7.finalDZ.model.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Logger {
    private FileWriter writer;
    private String inputData;
    private Date localTime;

    public Logger(String pathFile) throws IOException{
            this.writer = new FileWriter(pathFile, true);
    }

    public void writeLog(ComplexNumber result) {
        localTime = new Date();
        String time = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss").format(localTime);
//        String time = String.format(
//                "%d-%d-%d   %d:%d:%d",
//                localTime.getDayOfMonth(), localTime.getMonthValue(),
//                localTime.getYear(), localTime.getHour(), localTime.getMinute(),
//                localTime.getSecond()
//        );
        try {
            this.writer.write(
                    time + "\nВходные данные: " + inputData + "\n" +
                            "Результат: " + result.toString() + "\n" +
                            "===========================================" + "\n"
            );
            this.writer.flush();
            this.writer.close();
        } catch (IOException e) {
            System.out.println("ошибка в методе writeLog()");
        }
    }

    public void writeInputData(ArrayList<String> data) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            if (i == 1) {
                builder.append(data.get(i) + " ");
            } else {
                builder.append("(" + data.get(i) + ") ");
            }
        }
        this.inputData = builder.toString();
    }
}
