package School.Action.Base;

import PhoneBook.Inetrfaces.IAction;
import School.Students.Student;
import School.View.View;

public abstract class Action implements IAction {
    public View viewer = new View();
    String path1 = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\School\\Data\\FirstGrade.txt";
    String path2 = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\School\\Data\\SecondGrade.txt";
    String path3 = "C:\\Users\\Pengsaur\\Desktop\\Учеба\\Программирование\\I. Введение в ООП\\Seminar 5\\PhoneBook and Calculator\\School\\Data\\ThirdGrade.txt";
    protected String[] arrChoose = new String[]{path1,path2, path3};

}
