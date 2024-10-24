package creationalDesignPatterns.abstractFactory.factories;

import creationalDesignPatterns.abstractFactory.buttons.Button;
import creationalDesignPatterns.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
