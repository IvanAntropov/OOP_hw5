package PhoneBook.Actions;

import PhoneBook.Actions.Base.Action;
import PhoneBook.View.ConsoleReader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DeletePhone extends Action {


    public DeletePhone() {
        super();
    }

    private boolean deleteByName(){
        ConsoleReader console1 = new ConsoleReader();
        viewer.getText("nameText");
        String nameDelete = console1.read();
        if(nameDelete.equals("0")){
            return false;
        }
        if(data.containsKey(nameDelete)){
            data.remove(nameDelete);
            viewer.getText("deleteText2");
        }else{
            System.out.println("=== Not found ===");
        }
        return false;
    }

    private boolean deleteByPhone() {
        ConsoleReader console1 = new ConsoleReader();
        viewer.getText("nameText");
        String phoneDelete = console1.read();
        if(phoneDelete.equals("0")){
            return false;
        }
        Collection<String> keysO = data.keySet();
        List<String> keys = keysO.stream().toList();
        Collection<String> valuesO = data.values();
        List<String> values = valuesO.stream().toList();
        for(int i = 0; i > values.size(); i++){
            String value = values.get(i);
            if(value.equals(phoneDelete)){
                data.remove(keys.get(i));
                return false;
            }
        }
        System.out.println("=== Not found ===");
        return false;
    }

    @Override
    public boolean action() {
        ConsoleReader console1 = new ConsoleReader();
        viewer.getText("deleteText");
        int choose = console1.readInt(0,2);
        if (choose == 1) {
            return deleteByName();
        } else if (choose == 2) {
            return deleteByPhone();
        }else{
            return false;
        }
    }
}