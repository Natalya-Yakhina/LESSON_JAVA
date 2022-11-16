//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Arrays;

public class Zadacha9 {
    public static void main(String[] args) {
            int[] array = {  1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            method(array);
    }   

    private static void method(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] = array[i]*2;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
