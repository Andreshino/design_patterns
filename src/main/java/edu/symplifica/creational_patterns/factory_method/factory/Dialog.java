package edu.symplifica.creational_patterns.factory_method.factory;

import edu.symplifica.creational_patterns.factory_method.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
