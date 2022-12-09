import View.ConsoleView;
import View.View;

public class Homework3 {
    public static void main(String[] args) {
        Programm.Presenter<View> prog = new Programm.Presenter<View>(new ConsoleView());
        prog.start();
    }
}
    
