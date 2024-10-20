package factory_method.buttons;

public class HtmlButton implements Button{

    public void render() {
        System.out.println("<button>Test button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello world!'");
    }
}
