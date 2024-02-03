package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Реализация логгера, записывающего логи в текстовый файл и выводящего их в
 * консоль
 */

public class TextLogger implements iLogger {
    private String filePath;

    /**
     * Конструктор, принимающий путь к файлу логов
     * 
     * @param filePath
     */
    public TextLogger(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Метод, записывающий логи в файл и выводящий их в консоль
     */
    @Override
    public void log(String message) {
        // Получаем текущую дату и время
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String timestamp = dateFormat.format(new Date());

        // Логируем сообщение в консоль
        System.out.println("[" + timestamp + "] \n" + message);

        // Логируем сообщение в файл
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println("[" + timestamp + "] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
