//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 11. Написать метод, принимающий на вход два аргумента: len и initialValue, 
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

public class Zadacha11 {
    public static void main(String[] args) {
        values(6, 4);
    }

    public static void values(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print("[" + i + "]" + array[i] + " ");
        }
    }
}
