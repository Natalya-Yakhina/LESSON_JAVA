//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее (sum / count) из этого списка. 
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package HW.HW3;

import java.util.ArrayList;
import java.util.Collections;

public class Zadacha2 {
      public static void main(String[] args) {
          ArrayList <Integer> list = new ArrayList<Integer>();
          Collections.addAll(list, 1, 2, 4, 8, 16, 3, 13, 21, 25, 76);
          System.out.printf("Исходный список: \n" + list);

          System.out.println("\nМинимальное значение списка: " + minValue(list));
          System.out.println("Максимальное значение списка: " + maxValue(list));
          System.out.println("Среднее арифметическое списка: " + Average(list));
      }

      public static int minValue(ArrayList<Integer> list) {
          int min = list.get(0);
          for (int i = 0; i < list.size(); i++) {
              if (min > list.get(i)) {
                  min = list.get(i);
              }
          }
          return min;
      }

      public static int maxValue(ArrayList<Integer> list) {
          int max = list.get(0);
          for (int i = 0; i < list.size(); i++) {
              if (max < list.get(i)) {
                  max = list.get(i);
              }
          }
          return max;
      }

      public static float Average(ArrayList<Integer> list) {
          float sum = 0;
          for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
          }
          return sum / list.size();
      }
}
// ------------------------------------ 2 ----------------------------------------
// без отдельных методов
          // int minValue = list.get(0);
          // int maxValue = list.get(0);
          // int sum = 0;

          // for (Integer i : list) {
          //     sum += i;
          //     if (i < minValue){
          //       minValue = i;
          //     }
          //     if (i > maxValue){
          //       maxValue = i;
          //     }
          // }
          // double average = (double) sum / (double) list.size();

          // System.out.println("\nМинимальное значение списка: " + minValue);
          // System.out.println("Максимальное значение списка: " + maxValue);
          // System.out.println("Среднее арифметическое списка: " + average);