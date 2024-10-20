package factory_method.factory;

import factory_method.buttons.Button;

public abstract class Dialog {
    public void renderWindow(){

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasele vor suprascrie aceasta metoda ca sa creeze obiecte de tip buton specifice.
     */
    public abstract Button createButton();
}
