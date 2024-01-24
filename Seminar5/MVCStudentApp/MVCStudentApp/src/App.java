import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetViev;
import Model.ModelClass;
import Viev.VievClass;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Stunt DB studList = new StuntDB();

        iGetModel model = new ModelClass(studList);
        iGetViev viev = new VievClass();

        // iGetModel fModel = new ModelClassFile("StuntDB.csv");

        // ControllerClass controller = new ControllerClass(fModel, viev);

        ControllerClass controller = new ControllerClass(model, viev);

        controller.update("Search all");
    }
}
