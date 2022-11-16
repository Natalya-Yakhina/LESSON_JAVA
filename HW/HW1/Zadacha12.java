//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 12. Задать одномерный массив и найти в нем минимальный и максимальный элементы
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

public class Zadacha12 {
    public static void main(String[] args) {
        int[] array = {  8, 5, 9, 2, 11, 4, 1 };
        method(array);
    }  

    private static void method(int[] array) {
        int min = array[0];
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max + " min = " + min);
    }  
}