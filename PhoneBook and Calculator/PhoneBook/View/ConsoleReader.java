package PhoneBook.View;

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
            if (in.hasNextLine()) {
                ConsoleString = in.nextLine();
                check = false;
            } else {
                System.out.println(text2);
            }
        }
//        in.close();
        return ConsoleString;
    }

    public int readInt(int min,int max){
        int ConsoleInt = 0;
        boolean check = true;
        while(check) {
            if (in.hasNextInt()) {
                ConsoleInt = in.nextInt();
                if(ConsoleInt>=min && ConsoleInt<=max) {
                    check = false;
                }else{
                    System.out.printf("\nВведи число от %d до %d",min,max);
                }
            } else {
                System.out.printf("\nВведи целое число!!!");
            }
        }
//        in.close();
        return ConsoleInt;
    }

}