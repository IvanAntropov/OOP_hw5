package PhoneBook.Actions.Base;

import PhoneBook.View.ConsoleReader;
import PhoneBook.Inetrfaces.IAction;
import PhoneBook.View.View;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class Action implements IAction {
    protected String path =  "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование" +
            "\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\PhoneBook\\Data\\Phones.txt";
    protected static Map<String,String> data = new HashMap<>();
    String name;
    String phone;
    public View viewer = new View();
    public ConsoleReader console = new ConsoleReader();

    public Action(View viewer) {
        super();
    }

    public Action() {
        super();

    }

    protected void read(){
        try(FileReader reader = new FileReader(path)) {
            String name = "";
            String phone = "";
            int c;
            boolean check = true;
            while(check){
                while ((c = reader.read()) != 61) {
                    name += (char) c;
                }
                while ((c = reader.read()) != 59){
                    phone += (char) c;
                }
                if((c = reader.read()) == -1){
                    check = false;
                }
                name = name.replaceAll("\n","");
                name = name.replaceAll("\\{","");
                name = name.replaceAll("}","");
                phone = phone.replaceAll("\n","");
                phone = phone.replaceAll("\\[","");
                phone = phone.replaceAll("]","");
                System.out.println(name + ": " + phone);
                phone = "";
                name = "";
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void readForMap(){
        try(FileReader reader = new FileReader(path)) {
            String name = "";
            String phone = "";
            int c;
            boolean check = true;
            while(check){
                while ((c = reader.read()) != 61) {
                    name += (char) c;
                }
                while ((c = reader.read()) != 59){
                    phone += (char) c;
                }
                if((c = reader.read()) == -1){
                    check = false;
                }
                name = name.replaceAll("\n","");
                name = name.replaceAll("\\{","");
                name = name.replaceAll("}","");
                phone = phone.replaceAll("\n","");
                phone = phone.replaceAll("\\[","");
                phone = phone.replaceAll("]","");
                data.put(name.toLowerCase(),phone);
                phone = "";
                name = "";
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}