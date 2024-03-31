package edu.symplifica.behavioral_patterns.observer;

import edu.symplifica.behavioral_patterns.observer.editor.Editor;
import edu.symplifica.behavioral_patterns.observer.listeners.EmailNotificationListener;
import edu.symplifica.behavioral_patterns.observer.listeners.LogOpenListener;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
