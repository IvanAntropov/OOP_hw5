package PhoneBook.Actions;

import PhoneBook.Actions.Base.Action;
import PhoneBook.Core.Manager;
import PhoneBook.View.ConsoleReader;

public class ShowPhone extends Action {
    private String path;

    public ShowPhone(String path) {
        this.path = path;
    }
    public ShowPhone() {}

    private void showByName(String nameClass){
        if(data.containsKey(nameClass)){
            System.out.println(nameClass + ":\n" +data.get(nameClass));
        }else{
            System.out.println("\n\n===Nothing===");
        }
    }

    private void showAll(){
        read();
    }

    @Override
    public boolean action() {
        ConsoleReader console1 = new ConsoleReader();
        ConsoleReader console2 = new ConsoleReader();
        readForMap();
        Manager app = new Manager();
        viewer.getText("showText");
        int choose = console1.readInt(0,2);
        if (choose == 1) {
            showAll();
        } else if (choose == 2) {
            viewer.getText("nameText");
            String userName = console2.read();
            showByName(userName.toLowerCase());
        }
        return false;
    }
}
