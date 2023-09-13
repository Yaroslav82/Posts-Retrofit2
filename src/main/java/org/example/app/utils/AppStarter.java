package org.example.app.utils;

import org.example.app.controller.AppController;
import org.example.app.model.AppModel;
import org.example.app.view.AppView;

public class AppStarter {

    public static void startApp() {
        AppController controller = new AppController(new AppModel(), new AppView());
        controller.runApp();
    }
}
