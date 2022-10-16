package PhoneBook.Core;

import PhoneBook.Actions.AddPhone;
import PhoneBook.Actions.Base.Action;
import PhoneBook.Actions.DeletePhone;
import PhoneBook.Actions.ShowPhone;
import PhoneBook.View.ConsoleReader;
import PhoneBook.View.View;

public class Manager {
    Action action;
    AddPhone adder;
    DeletePhone deleter;
    ShowPhone shower;
    View viewer;
    ConsoleReader console = new ConsoleReader();
    Action[] arrChoose = new Action[]{new AddPhone(),new ShowPhone(),new DeletePhone()};

    public Manager() {
        this.adder = new AddPhone();
        this.deleter = new DeletePhone();
        this.shower = new ShowPhone();
        this.viewer = new View();
    }

    private void mainMenu(){
        int index = 5;
        while(index != 0){
            viewer.getText("mainText");
            index = console.readInt(0,4);
            if(index != 0){
                Action appManager = arrChoose[index-1];
                appManager.readForMap();
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