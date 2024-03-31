package edu.symplifica.creational_patterns.factory_method.factory;

import edu.symplifica.creational_patterns.factory_method.buttons.Button;
import edu.symplifica.creational_patterns.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
