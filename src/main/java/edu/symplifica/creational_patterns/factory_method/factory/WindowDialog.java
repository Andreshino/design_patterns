package edu.symplifica.creational_patterns.factory_method.factory;

import edu.symplifica.creational_patterns.factory_method.buttons.Button;
import edu.symplifica.creational_patterns.factory_method.buttons.WindowButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
