//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW3;

import java.util.ArrayList;
import java.util.Collections;

public class Zadacha1 {
    public static void main(String[] args) {    
        ArrayList <Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 4, 8, 16, 3, 13, 21, 25, 76);
        System.out.printf("Исходный список: \n" + list);
        
        // ---------------------- 1 -------------------------

        for(int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0)
            {
                list.remove(i);
                i --;
            }
        }
        System.out.printf("\nОбработанный список: \n" + list);

        // ---------------------- 2 -------------------------

        // ArrayList<Integer> remove = new ArrayList<Integer>();
        // for(Integer i : list){
        //     if (i % 2 == 0){
        //         Collections.addAll(remove, i);
        //     }
        // }
        // list.removeAll(remove);
        // System.out.printf("\nОбработанный список: \n" + list);
    }
}