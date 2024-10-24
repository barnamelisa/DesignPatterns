package creationalDesignPatterns.factoryMethod.factory;

import creationalDesignPatterns.factoryMethod.buttons.Button;
import creationalDesignPatterns.factoryMethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}