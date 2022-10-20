package School.Action;

import PhoneBook.View.ConsoleReader;
import School.Action.Base.Action;
import School.Students.Student;

public class Relocate extends Action {
    ConsoleReader console1 = new ConsoleReader();

    @Override
    public boolean action() {
        Add ad = new Add();
        Delete dl = new Delete();
        dl.action();
        System.out.printf("\nВ какой класс переводим?\nEnter: ");
        int grade = console1.readInt(1,3);
        String path = arrChoose[grade-1];
        Student student = dl.actionForRelocate();
        ad.addStudent(grade,student);
        return false;
    }
}