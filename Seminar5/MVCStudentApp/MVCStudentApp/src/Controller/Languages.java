package Controller;

public class Languages {

    public static String langStud;
    public static String langAge;
    public static String langStudList;
    public static String langInput;
    public static String langExit;
    public static String emptyList;
    public static String IdInput;
    public static String delError;
    public static String delMessage;

    public static int setLanguage;

    public static void setLanguage() {
        setLanguage = ControllerClass.languages;

        if (setLanguage == 1) {

            langStud = "Студент";
            langAge = "возраст";
            langStudList = "Список студентов";
            langInput = "Введите команду";
            langExit = "Выход";
            emptyList = "Список студентов пуст";
            IdInput = "Введите ID Студента";
            delError = "Студента с таким ID нет";
            delMessage = "удален из списка";

        } else {

            langStud = "Student";
            langAge = "age";
            langStudList = "List of students";
            langInput = "Enter command";
            langExit = "Exit";
            emptyList = "The list of students is empty";
            IdInput = "Enter the ID of the student";
            delError = "The student with this ID does not exist";
            delMessage = "deleted from the list";
        }
    }
}
