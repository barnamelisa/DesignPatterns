package creationalPatterns;

import creationalPatterns.abstract_factory.app.Application;
import creationalPatterns.abstract_factory.factories.GUIFactory;
import creationalPatterns.abstract_factory.factories.MacOSFactory;
import creationalPatterns.abstract_factory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory guiFactory;
        String osName=System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            guiFactory=new MacOSFactory();
        } else {
            guiFactory=new WindowsFactory();
        }
        app=new Application(guiFactory);
        return app;
    }

    public static void main(String[] args){
        Application app=configureApplication();
        app.paint();
    }
}
