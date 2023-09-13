package org.example.app.view;

import java.util.Scanner;

public class PostView {

    private final Scanner scanner = new Scanner(System.in);

    public String getPostId() {
        System.out.print("\nInput post id: ");
        return scanner.nextLine();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
