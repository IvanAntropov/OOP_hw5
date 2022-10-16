package PhoneBook.Actions;

import PhoneBook.Actions.Base.Action;
import PhoneBook.Core.Manager;
import PhoneBook.View.ConsoleReader;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Можно указать путь.
 *
 * По умолчанию стоит на мою книжку
 */
public class AddPhone extends Action {
//        Manager appShower = new Manager();
        public AddPhone() {
        }

        /**
         * True дописать
         *
         * False переписать
         */
        private void addPhone(String data,boolean check){
        if(check){
            try {
                PrintWriter output = new PrintWriter(new FileWriter(path, true));
                write(output,data);
            }catch(Exception e)
            {
                e.getStackTrace();
            }
        }else{
            try {
                Writer output = new FileWriter(path);
                write(output,data);
            }catch(Exception e)
            {
                e.getStackTrace();
            }
        }
    }
    private <E1 extends Writer> void write(E1 output,String data){
        try{
            output.write(data + "\n");
            output.close();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }

    private String getPhone(){
        ConsoleReader console1 = new ConsoleReader();
        ConsoleReader console2 = new ConsoleReader();
        Manager appShower = new Manager();
        String phoneAdd = "";
        boolean check = true;
        String yn;
        while (check){
            viewer.getText("phoneText");
            phoneAdd = console1.read();
            if(phoneAdd.equals("0"))
            {
                return null;
            }else{
                if((phoneAdd.length() == 12 && (phoneAdd.contains("+7")) || (phoneAdd.contains("8") && phoneAdd.length() == 11))){
                    check = false;
                    viewer.getText("anotherPhoneText");
                    yn = console2.read().toLowerCase();
                    if(yn.equals("y")){
                        return phoneAdd + ", " + getPhone();
                    }else{
                        return phoneAdd;
                    }
                }else{
                    phoneAdd = "";
                }
            }
        }
        return null;
    }

    @Override
    public boolean action() {
        ConsoleReader console1 = new ConsoleReader();
        Manager appShower = new Manager();
        viewer.getText("nameText");
        String nameAdd = console1.read();
        if(nameAdd.equals("0")){
            return false;
        }else {
            String phoneAdd = "";
            String newPhone = "";
            phoneAdd = getPhone();
            if(phoneAdd == null){
                return false;
            }
            newPhone = "\n{" + nameAdd +"}=["+ phoneAdd + "];";
            addPhone(newPhone,true);
            data.put(nameAdd,phoneAdd);
        }
        return false;
    }
}