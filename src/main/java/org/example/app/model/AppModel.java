package org.example.app.model;

import org.example.app.controller.PostController;
import org.example.app.view.PostView;

public class AppModel {

    private final PostController controller;

    public AppModel() {
        controller = new PostController(new PostModel(), new PostView());
    }

    public void readPosts() {
        controller.getPosts();
    }

    public void readPostById() {
        controller.getPostById();
    }
}
