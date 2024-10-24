package creationalDesignPatterns.factoryMethod.factory;

import creationalDesignPatterns.factoryMethod.buttons.Button;
import creationalDesignPatterns.factoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
