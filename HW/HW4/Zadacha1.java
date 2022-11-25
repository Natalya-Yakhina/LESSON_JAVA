//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW4;

import java.util.LinkedList;
import java.util.List;

public class Zadacha1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i < 5; i++){
            list.add(i);
        }
        System.out.println("Исходный список: " + list);

        LinkedList<Integer> listNew = new LinkedList<Integer>();
        for(int i = list.size() - 1; i >= 0; i--){
            listNew.add(list.get(i));
        }
        System.out.println("Перевернутый массив: " + listNew);
    }
}