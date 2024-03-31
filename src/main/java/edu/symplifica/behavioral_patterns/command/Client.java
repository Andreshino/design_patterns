package edu.symplifica.behavioral_patterns.command;

import edu.symplifica.behavioral_patterns.command.editor.Editor;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
