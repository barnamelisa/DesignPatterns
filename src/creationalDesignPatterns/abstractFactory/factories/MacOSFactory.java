package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.buttons.Button;
import creationalDesignPatterns.abstractFactory.buttons.MacOSButton;
import creationalDesignPatterns.abstractFactory.checkboxes.Checkbox;
import creationalDesignPatterns.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
