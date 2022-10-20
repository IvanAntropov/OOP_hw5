package School.Action;

import PhoneBook.View.ConsoleReader;
import School.Action.Base.Action;
import School.FileWorker.ReaderFile;

public class Show extends Action {

    ConsoleReader console2 = new ConsoleReader();
    public Show() {
        super();
    }

    @Override
    public boolean action() {
        viewer.getText("classText");
        int grade = console2.readInt(1,3);
        String path = arrChoose[grade-1];
        ReaderFile rd = new ReaderFile();
        System.out.println(ReaderFile.readToString(path));
        return false;
    }
}