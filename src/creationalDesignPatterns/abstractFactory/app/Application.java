package creationalDesignPatterns.abstractFactory.app;

import creationalDesignPatterns.abstractFactory.buttons.Button;
import creationalDesignPatterns.abstractFactory.checkboxes.Checkbox;
import creationalDesignPatterns.abstractFactory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
