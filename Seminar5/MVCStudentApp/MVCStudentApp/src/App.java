
import java.util.HashMap;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;

import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {

        // iGetView view;

        // Student DB studList = new StuntDB();
        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        // Student student6 = new Student("Karina", 25);
        // Student student7 = new Student("Andrey", 22);
        // Student student8 = new Student("Masha", 27);
        // Student student9 = new Student("Irina", 28);
        // Student student10 = new Student("Nikolay", 30);

        // List<Student> studList = new ArrayList<>();
        // studList.add(student1);
        // studList.add(student2);
        // studList.add(student3);
        // studList.add(student4);
        // studList.add(student5);
        // studList.add(student6);
        // studList.add(student7);
        // studList.add(student8);
        // studList.add(student9);
        // studList.add(student10);

        HashMap<Long, Student> studBuffer = new HashMap<>();

        studBuffer.put(student1.getId(), student1);
        studBuffer.put(student2.getId(), student2);
        studBuffer.put(student3.getId(), student3);
        studBuffer.put(student4.getId(), student4);
        studBuffer.put(student5.getId(), student5);

        iGetView view;
        iGetModel hashList = new ModelClassHash(studBuffer);

        if (ControllerClass.languages == 1) {
            view = new ViewClass();
        } else {
            view = new ViewClassEng();
        }
        ControllerClass controller = new ControllerClass(hashList, view);
        controller.run();

        // ControllerClass controller = new ControllerClass(hashList, view);

        // iGetModel model = new ModelClassFile(studList);
        // iGetView view = new ViewClass();
        // iGetModel fModel = new ModelClassFile("StudentDB.csv");

        // ControllerClass controller = new ControllerClass(fModel, view);

        // ControllerClass controller = new ControllerClass(model, viev);
        // controller.update("Search all");

    }
}
