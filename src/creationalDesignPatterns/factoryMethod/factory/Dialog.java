package creationalDesignPatterns.factoryMethod.factory;

import creationalDesignPatterns.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
