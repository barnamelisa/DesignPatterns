package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.buttons.Button;
import creationalDesignPatterns.abstractFactory.buttons.WindowsButton;
import creationalDesignPatterns.abstractFactory.checkboxes.Checkbox;
import creationalDesignPatterns.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
