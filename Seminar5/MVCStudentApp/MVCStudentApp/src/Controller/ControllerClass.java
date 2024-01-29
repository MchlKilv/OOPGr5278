package Controller;

// import java.util.ArrayList;
// import java.util.List;
import java.util.HashMap;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

// import Model.ModelClassFile;
// import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private HashMap<Long, Student> students = new HashMap<>();
    public static int languages;
    // private List<Student> studBuffer = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(HashMap<Long, Student> stud)
    // List<Student> stud
    {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void update() {

        // MVP
        students = model.getStudents();
        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println(Languages.emptyList);
        }

        // MVC
        // viev.printALLStudents(model.getStudents());
    }

    public void run() {

        System.out.println("Select language, Выберите язык:");
        System.out.println("Русский нажмите 1.");
        System.out.println("For English press 2.");
        languages = sc.nextInt();
        Languages.setLanguage();

        Command com = (Command) Command.NONE;
        boolean getNewIter = true;
        while (getNewIter) {
            String command = view.prompt(Languages.langInput);
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println(Languages.langExit);
                    break;
                case LIST:
                    view.printAllStudents(model.getStudents());
                    break;
                case DELETE:
                    System.out.println(Languages.IdInput);
                    Long id = sc.nextLong();
                    if (model.getStudents().containsKey(id)) {
                        System.out.println(model.getStudents().get(id) + " - " + Languages.delMessage);
                        model.getStudents().remove(id);
                    } else {
                        System.out.println(Languages.delError);
                    }
                    break;
            }
        }
    }

}
