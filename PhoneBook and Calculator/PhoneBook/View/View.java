package PhoneBook.View;

import java.util.HashMap;
import java.util.Map;

public class View {
    static Map<String,String> dataView = new HashMap<>();

    public View(){
        dataView.put("mainText","\n\n" +
                "Выберите действие:\n" +
                "1) Добавить номер\n" +
                "2) Показать номер\n" +
                "3) Удалить номер\n" +
                "4) Импортировать номер\n" +
                "0) Выйти\n\nEnter: ");
        dataView.put("nameText","\n\n0) Назад\n\nВведите имя: ");
        dataView.put("phoneText","\n\n0) Назад\n\nВведите номер: ");
        dataView.put("anotherPhoneText","\n\nЕще номер? y/n: ");

        dataView.put("deleteText1","\n\n1) По номеру\n2) По имени\n\n0) Назад\n\nEnter: ");
        dataView.put("deleteText2","\n\nНомер удален");

        dataView.put("showText","\n\n1) Все номера\n2) По имени\n\n0) Назад\n\nEnter: ");

        dataView.put("On","\n\n===On===\n\nВас приветствует PhoneBook!\\n");
        dataView.put("Off","\n\n===Off===\n\n");
    }

    public void getText(String key){
        String str = dataView.get(key);
        System.out.printf(str);
    }
}