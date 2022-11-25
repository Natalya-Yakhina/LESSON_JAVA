package HW.HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    
    private Map<String, List<String>> map = new HashMap<>();

    public void add(String name, String number) {
    // TODO: 21.11.2022 Реализовать
    List<String> numbers;
    if (map.containsKey(name)){
        numbers = map.get(name);
    }
    else{
        numbers = new ArrayList<>(); // если его там нет, то создать
    }
    numbers.add(number);
    map.put(name, numbers); // обновляем
}

public List<String> get(String name) {
    // TODO: 21.11.2022 Реализовать получение всех номеров по фамилии
    return map.get(name);
}
}
