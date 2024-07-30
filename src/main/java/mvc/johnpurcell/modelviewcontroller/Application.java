package mvc.johnpurcell.modelviewcontroller;

import mvc.johnpurcell.modelviewcontroller.controller.Controller;
import mvc.johnpurcell.modelviewcontroller.model.Model;
import mvc.johnpurcell.modelviewcontroller.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });

    }

    public static void runApp() {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        view.setLoginListener(controller);
    }
}
