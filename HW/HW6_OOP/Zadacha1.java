package HW.HW6_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Zadacha1{

    public static int inputChoice(){ // метод для поиска
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите по какому критерию поиск: \n1 - ОЗУ \n2 - Объем HHD или SSD \n3 - Операционная система \n4 - Цвет");
        System.out.println("Ваш выбор: ");
        int choice = iScanner.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Map<Integer, String> filter = new HashMap<>(); // коллекция с вариантами фильтров
        Map<String, Notebook> result = new LinkedHashMap<>(); // результаты фильтра

        Set<Notebook> notebooks = new HashSet<>(); // коллекция с ноутбуками
        
        Notebook notebook1 = new Notebook("DDR3", "HDD", "Linux", "black");
        Notebook notebook2 = new Notebook("DDR", "SDD", "Windows", "orange");
        Notebook notebook3 = new Notebook("DDR4", "SDD", "macOs", "red");
        Notebook notebook4 = new Notebook("DDR4", "SDD", "macOs", "green");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);

        filter.put(1, "ОЗУ");
        filter.put(2, "Объем HHD или SSD");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");

        int choice = inputChoice();
        if(filter.containsKey(choice)){
            switch(choice){
                case 1:{
                    System.out.printf("Введите название %s: \n", filter.get(1)); // ОЗУ
                    System.out.print("Ввод: ");
                    String input = iScanner.next();
                    Notebook.findByOperMemory(notebooks, input, result);
                    result(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s: \n", filter.get(2)); // HHD или SSD 
                    System.out.print("Ввод: \n");
                    String input = iScanner.next();
                    Notebook.findByHdd(notebooks, input, result);
                    result(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s: \n", filter.get(3)); // операционная система
                    System.out.print("Ввод: \n");
                    String input = iScanner.next();
                    Notebook.findByOperatingSystem(notebooks, input, result);
                    result(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s: \n", filter.get(4)); // цвет
                    System.out.print("Ввод: \n");
                    String input = iScanner.next();
                    Notebook.findByColor(notebooks, input, result);
                    result(result);
                    break;
                }
                default:{
                    break;
                }
            }
        }
        iScanner.close();
    }

    public static void result(Map<String, Notebook> result){ // метод вывода результата
        for (var notebook : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", notebook.getKey(), notebook.getValue().toString()); // ключ, значение 
        }
    }
}

