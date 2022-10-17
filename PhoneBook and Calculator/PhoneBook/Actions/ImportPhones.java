package PhoneBook.Actions;

import PhoneBook.Actions.Base.Action;
import PhoneBook.View.ConsoleReader;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ImportPhones extends Action {

    public ImportPhones(){
    }

    private void convertToXML(){
        String path = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование" +
                "\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\PhoneBook\\Data\\Phones.xml";
        Collection<String> keysO = data.keySet();
        List<String> keys = keysO.stream().toList();
        Collection<String> valuesO = data.values();
        List<String> values = valuesO.stream().toList();
        String XMLstring ="";
        for(int i = 0; i < values.size(); i++){
            XMLstring = String.format("<contact>\n   <name>%s</name>\n   <phones>%s</phones>\n</contact>",keys.get(i),values.get(i));
            addPhone(XMLstring,true, path);
        }
        System.out.println("=== SUCCESS ===");
    }

    private void convertToJSON(){
        String path = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование" +
                "\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\PhoneBook\\Data\\Phones.json";
        Collection<String> keysO = data.keySet();
        List<String> keys = keysO.stream().toList();
        Collection<String> valuesO = data.values();
        List<String> values = valuesO.stream().toList();
        String JSONstring ="";
        for(int i = 0; i < values.size(); i++){
            JSONstring = String.format("{\n\"%s\": [\n{\n\"Phones\": %s\n}\n]\n}",keys.get(i),values.get(i));
            addPhone(JSONstring,true, path);
        }
        System.out.println("=== SUCCESS ===");
    }

    private void convertToCSV(){
        String path = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование" +
                "\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\PhoneBook\\Data\\Phones.csv";
        Collection<String> keysO = data.keySet();
        List<String> keys = keysO.stream().toList();
        Collection<String> valuesO = data.values();
        List<String> values = valuesO.stream().toList();
        String CSVstring ="";
        for(int i = 0; i < values.size(); i++){
            CSVstring = String.format("%s,\"%s\"",keys.get(i),values.get(i));
            addPhone(CSVstring,true, path);
        }
        System.out.println("=== SUCCESS ===");
    }

    private void addPhone(String data,boolean check, String path){
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

    @Override
    public boolean action() {
        ConsoleReader consoleImport = new ConsoleReader();
        System.out.printf("\nВ какой формат ковертим?\n1) XMl\n2) JSON\n3) CSV\n\n0) Назад\nEnter: ");
        int choose = consoleImport.readInt(0,3);
        if(choose == 0){
            return false;
        }else if(choose == 1){
            convertToXML();
        }else if(choose == 2){
            convertToJSON();
        }else if(choose == 3){
            convertToCSV();
        }
        return false;
    }
}