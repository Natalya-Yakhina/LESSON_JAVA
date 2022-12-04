package HW.HW6_OOP;

import java.util.Map;
import java.util.Set;

public class Notebook {
    String operMemory;
    String hdd;
    String operatingSystem;
    String colors;

    public Notebook (String operMemory, String hdd, String operatingSystem, String colors){
        this.operMemory = operMemory;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.colors = colors;
    }

    public static void findByOperMemory(Set<Notebook> notebooks, String input, Map<String, Notebook> result){ // метод поиска по процессору  
        int count = 1;
        for(Notebook notebook : notebooks){
            if(notebook.operMemory.contains(input)){
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }
    }

    public static void findByHdd(Set<Notebook> notebooks, String input, Map<String, Notebook> result){ // метод поиска по объему HHD или SSD 
        int count = 1;
        for(Notebook notebook : notebooks){
            if(notebook.hdd.contains(input)){
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        }  
    } 

    public static void findByOperatingSystem(Set<Notebook> notebooks, String input, Map<String, Notebook> result){ // метод поиска по операционной системе  
        int count = 1;
        for(Notebook notebook : notebooks){
            if(notebook.operatingSystem.contains(input)){
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        } 
    } 

    public static void findByColor(Set<Notebook> notebooks, String input, Map<String, Notebook> result){ // метод поиска по цвету 
        Integer count = 1;
        for(Notebook notebook : notebooks){
            if(notebook.colors.contains(input)){
                result.put(String.format("Ноутбук № %d", count), notebook);
                count++;
            }
        } 
    }

    @Override
    public String toString() {
        return String.format("Характеристики: %s\nОЗУ: %s\nHDD: %s\nОперационная система: %s\nЦвет: %s", operMemory, hdd, operatingSystem, colors);
    }
}