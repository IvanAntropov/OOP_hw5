package School.Action;

import PhoneBook.View.ConsoleReader;
import School.Action.Base.Action;
import School.FileWorker.ReaderFile;
import School.FileWorker.WriterFile;
import School.Students.Student;

import static School.FileWorker.ReaderFile.readToFindName;

public class Delete extends Action {
        ConsoleReader console1 = new ConsoleReader();

        public Delete(){
            super();
        }

        private void deleteStudent(String path, String name){
            ReaderFile rd = new ReaderFile();
            WriterFile wr = new WriterFile();
            wr.writeWithoutAdd(path,rd.readToDelete(path,name));
        }

        @Override
        public boolean action() {
            viewer.getText("classText");
            int grade = console1.readInt(1,3);
            String path = arrChoose[grade];
            System.out.printf("Введите имя и фамилию ученика: ");
            String name = console1.read();
            deleteStudent(path,name);
            return false;
        }

        public Student actionForRelocate() {
            viewer.getText("classText");
            int grade = console1.readInt(1,3);
            String path = arrChoose[grade-1];
            System.out.printf("Введите имя и фамилию ученика: ");
            String name = console1.read();
            Student nameSt = readToFindName(path,name);
            deleteStudent(path,name);
            return nameSt;
        }
    }

