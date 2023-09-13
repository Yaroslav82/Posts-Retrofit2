package org.example.app.controller;

import org.example.app.model.AppModel;
import org.example.app.utils.Constants;
import org.example.app.view.AppView;

public class AppController {

    private final AppModel model;
    private final AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        filterChoice(view.chooseOption());
    }

    private void filterChoice(String choice) {
        switch (choice) {
            case "1" -> model.readPosts();
            case "2" -> model.readPostById();
            case "0" -> view.getOutput(Constants.APP_CLOSED_MSG);
            default -> view.getOutput("Unexpected value: " + choice);
        }
    }
}
