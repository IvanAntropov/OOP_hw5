package School.Action;

import PhoneBook.View.ConsoleReader;
import School.Action.Base.Action;
import School.FileWorker.WriterFile;
import School.Students.Student;

public class Add extends Action {
    ConsoleReader console1 = new ConsoleReader();

    public Add(){
        super();
    }

    public void addStudent(int grade, Student student){
        WriterFile wr = new WriterFile();
        wr.write(arrChoose[grade-1],student.toString());
    }

    @Override
    public boolean action() {
        viewer.getText("nameText");
        String name = console1.read();
        viewer.getText("secondNameText");
        String secondName = console1.read();
        viewer.getText("sexText");
        String sex = console1.read();
        viewer.getText("dateText");
        String date = console1.read();
        viewer.getText("ageText");
        int age = console1.readInt(0,99);
        Student student = new Student(name,secondName,sex,date,age);
        viewer.getText("classText");
        int grade = console1.readInt(1,3);
        addStudent(grade,student);
        return false;
    }

}