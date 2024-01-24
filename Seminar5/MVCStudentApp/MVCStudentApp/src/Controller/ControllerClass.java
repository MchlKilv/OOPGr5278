package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetViev;
// import Model.ModelClass;
import Model.Domain.Student;
// import Viev.VievClass;

public class ControllerClass {

    private iGetModel model;
    private iGetViev viev;
    private List<Student> studBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetViev viev) {
        this.model = model;
        this.viev = viev;
    }

    private boolean testData(List<Student> stud) {
        if (stud.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void update(String Request) {

        // MVP
        studBuffer = model.getStudents();
        if (testData(studBuffer)) {
            viev.printALLStudents(studBuffer);
        } else {
            System.out.println("No data");
        }

        // MVC
        // viev.printALLStudents(model.getStudents());
    }
}
