package School.Students;

public class Student {
    String name;
    String secondName;
    String sex;
    String dateOfBirth;
    int age;

    public Student(String name, String secondName, String sex, String dateOfBirth, int age) {
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + secondName + ": [" + sex +","+ dateOfBirth +","+ age +"]\n";
    }

}