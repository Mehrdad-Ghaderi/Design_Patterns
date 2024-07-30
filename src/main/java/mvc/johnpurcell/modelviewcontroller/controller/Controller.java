package mvc.johnpurcell.modelviewcontroller.controller;

import mvc.johnpurcell.modelviewcontroller.model.Model;
import mvc.johnpurcell.modelviewcontroller.model.PersonDAO;
import mvc.johnpurcell.modelviewcontroller.view.LoginFormEvent;
import mvc.johnpurcell.modelviewcontroller.view.LoginListener;
import mvc.johnpurcell.modelviewcontroller.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;
    private PersonDAO personDAO = new PersonDAO();
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /*public void userCreated(CreateUserEvent event) {

    }*/
    @Override
    public void loginPerformed(LoginFormEvent event) {

        System.out.println("Login event received: " + event.getName() + ", pass: " + event.getPassword());

    }
}

