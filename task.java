package HomeWorkItog;

import java.util.HashMap;
import java.util.Map;

public class task{
    public static void main(String[] args) {
       Map<String, String> telephoneDirectory = new HashMap<>(); // создаем пустой телефонный справочник
        telephoneDirectory.put("Ivanov", "8-111-1231212"); // добавляем фамилии и номера телефонов
        telephoneDirectory.put("Petrov", "8-111-1223212");
        telephoneDirectory.put("Sidorov", "8-111-1099912");
        String userKey = "Ivanov"; // для добавления абонента, проверяем есть ли он уже в справочнике
        String newPhoneNumber = "8-876-4567889";
        if (telephoneDirectory.containsKey(userKey)) // если абонент с такой фамилией уже есть, то добавляем еще номер телефона
        {
            telephoneDirectory.put(userKey, telephoneDirectory.get(userKey) + ',' + newPhoneNumber); 
                 }
        else {
            telephoneDirectory.put(userKey, newPhoneNumber); // если абонента с такой фамилией нет, то добавляем новый контакт
            }
       
         
    telephoneDirectory.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value)); 
    }
}