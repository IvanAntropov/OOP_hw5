package Calculator.View;


public class View {
    String text1;
    String text2;
    String text3;
    String text4;

    public View(String text1, String text2, String text3, String text4) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
    }

    public View() {
        this.text1 = "Введите первое число: ";
        this.text2 = "Введите операцию: ";
        this.text3 = "Введите второе число: ";
        this.text4 = "Ответ: ";
    }

    public void firstDigitText(){ System.out.printf(text1); }
    public void operationDigitText(){
        System.out.printf(text2);
    }
    public void secondDigitText(){
        System.out.printf(text3);
    }
    public void answerText(){
        System.out.printf(text4);
    }

}