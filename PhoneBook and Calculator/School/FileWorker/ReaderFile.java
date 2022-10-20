package School.FileWorker;

import School.Students.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReaderFile {

    public ReaderFile(){}

    public static HashMap<String, String> readToMap(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String str = "";
        HashMap<String, String> dict = new HashMap<>();
        while ((str = br.readLine()) != null) {
            String [] arrN = str.split(":");
            dict.put(arrN[0], arrN[1]);
        }
        br.close();
        return dict;
    }

    public static String readToString(String path) {
        String main = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String str = "";
            while ((str = br.readLine()) != null) {
                main +=str;
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return main;
    }

    public static String readToDelete(String path,String name){
        StringBuilder main = new StringBuilder();
        try {
            BufferedReader br = null;
            String str = "";
            br = new BufferedReader(new FileReader(path));
            while ((str = br.readLine()) != null) {
                if(!str.contains(name)){
                    main.append(str);
                }
            }
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return main.toString();
    }

    public static Student readToFindName(String path, String name){
        String main = "";
        try {
            BufferedReader br = null;
            String str = "";
            br = new BufferedReader(new FileReader(path));
            while ((str = br.readLine()) != null) {
                if(str.contains(name)){
                    main = str;
                }
            }
            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        String[] student = main.split(":");
        String[] bothName = student[0].split(" ");
        String characters = student[1].replaceAll("\\[","");
        characters = characters.replaceAll("]","");
        characters = characters.replaceAll(" ","");
        String[] studentValues = characters.split(",");
        Student studentReturn = new Student(bothName[0],bothName[1],studentValues[0],studentValues[1],Integer.parseInt(studentValues[2]));
        return studentReturn;
    }
}
