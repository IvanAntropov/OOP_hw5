package Calculator.Core;

import Calculator.Operations.Base.Operate;
import Calculator.Operations.Division;
import Calculator.Operations.Multi;
import Calculator.Operations.Subtraction;
import Calculator.Operations.Sum;
import Calculator.View.ConsoleReader;
import Calculator.View.View;

import java.util.ArrayList;

public class Manager {

    ConsoleReader console = new ConsoleReader();;
    View text;
    Operate answer;
    

    public Manager() {
        this.text = new View();
    }

    public void start(){
        text.firstDigitText();
        double firstDigit = checkerForDigits(console.read());
        text.operationDigitText();
        int operation = checkerForOperations(console.read());
        if(operation == 1){
            answer = new Sum();
        } else if (operation == 2) {
            answer = new Subtraction();
        } else if (operation == 3) {
            answer = new Multi();
        } else if (operation == 4){
            answer = new Division();
        }
        text.secondDigitText();
        double secondDigit = checkerForDigits(console.read());
        text.answerText();
        System.out.printf(answer.operate(firstDigit,secondDigit) + "");

    }

    private double checkerForDigits(String string){
        double doubleValue;
        try {
            doubleValue = Double.parseDouble(string);
            return doubleValue;
        } catch (NumberFormatException e) {
            System.out.println("Введите число!!!");
            text.firstDigitText();
            return checkerForDigits(console.read());
        }
    }

    private int checkerForOperations(String string){
        ArrayList<String> listOfOperations = new ArrayList<>();
        listOfOperations.add("+");
        listOfOperations.add("-");
        listOfOperations.add("*");
        listOfOperations.add("/");
        if(listOfOperations.contains(string)){
            if(string.equals("+")){
                return 1;
            }else if(string.equals("-")){
                return 2;
            } else if (string.equals("*")) {
                return 3;
            } else if (string.equals("/")){
                return 4;
            }
        }
        System.out.println("Введите оперант + - * / !!!");
        text.operationDigitText();
        return checkerForOperations(console.read());
    }
}

