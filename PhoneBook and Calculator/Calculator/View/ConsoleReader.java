package Calculator.View;

import java.util.Scanner;

public class ConsoleReader {
    String text1;
    String text2;
    Scanner in = new Scanner(System.in);

    public ConsoleReader() {
        this.text1 = "\nsuccess\n\n";
        this.text2 = "\nNothing to read\n";
    }

    public ConsoleReader(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public String read(){

        String ConsoleString = "";
        boolean check = true;
        while(check) {
            if (in.hasNext()) {
                ConsoleString = in.next();
                check = false;
//                System.out.printf(text1);
            } else {
                System.out.println(text2);
            }
        }
        return ConsoleString;
    }

}