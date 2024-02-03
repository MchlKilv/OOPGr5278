package Model;

public class TextLogger implements iLogger {
    private String filePath;

    public TextLogger(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void log(String message) {
        // Реализация записи логов в текстовый файл
        System.out.println("Лог: " + message);

    }

}
