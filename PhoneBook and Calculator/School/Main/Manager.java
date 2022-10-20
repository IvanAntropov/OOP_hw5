package School.Main;

import School.Action.Add;
import School.Action.Base.Action;
import School.Action.Delete;
import School.Action.Relocate;
import School.Action.Show;
import School.View.ConsoleReader;
import School.View.View;

public class Manager {
    View viewer = new View();
    ConsoleReader console = new ConsoleReader();
    Action[] arrChoose = new Action[]{new Add(),new Delete(), new Relocate(), new Show()};

    public Manager() {
    }

    private void mainMenu(){
        int index = 5;
        while(index != 0){
            viewer.getText("mainText");
            index = console.readInt(0,4);
            if(index != 0){
                Action appManager = arrChoose[index-1];
                appManager.action();
            }else{
                viewer.getText("Off");
            }
        }
    }

    public void Start(){
        viewer.getText("On");
        mainMenu();
    }
}