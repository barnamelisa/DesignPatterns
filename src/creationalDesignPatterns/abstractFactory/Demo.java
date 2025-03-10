package creationalDesignPatterns.abstractFactory;
import creationalDesignPatterns.abstractFactory.app.Application;
import creationalDesignPatterns.abstractFactory.factories.GUIFactory;
import creationalDesignPatterns.abstractFactory.factories.MacOSFactory;
import creationalDesignPatterns.abstractFactory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}