// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 8.Задать пустой целочисленный массив длиной 100. 
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Arrays;

public class Zadacha8 {
    public static void main(String[] args) {
        int[] array = new int[100];
        method(array);
        }
        
    private static void method(int[]array) {
        int j = 1;
        for(int i = 0; i < array.length; i++, j = j + 1) {
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
    }
}
