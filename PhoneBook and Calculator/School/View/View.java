package School.View;

import java.util.HashMap;
import java.util.Map;

public class View {
    static Map<String,String> dataView = new HashMap<>();

    public View(){
        dataView.put("mainText","\n\n" +
                "Выберите действие:\n" +
                "1) Добавить ученика в класс\n" +
                "2) Удалить ученика из класса\n" +
                "3) Перевести ученика\n" +
                "4) Показать учеников\n" +
                "0) Выйти\n\nEnter: ");
        dataView.put("nameText","\n\n0) Назад\n\nВведите имя: ");
        dataView.put("classText","\n\n0) Назад\n\nВведите класс: ");
        dataView.put("secondNameText","\n\n0) Назад\n\nВведите фамилию: ");
        dataView.put("ageText","\n\n0) Назад\n\nВведите возраст: ");
        dataView.put("dateText","\n\n0) Назад\n\nВведите дату рождения: ");
        dataView.put("sexText","\n\n0) Назад\n\nВведите пол: ");


        dataView.put("On","\n\n===On===\n\nSchool\n\n");
        dataView.put("Off","\n\n===Off===\n\n");
    }

    public void getText(String key){
        String str = dataView.get(key);
        System.out.printf(str);
    }
}