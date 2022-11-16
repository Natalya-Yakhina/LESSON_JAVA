//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 3. Написать метод, которому в качестве параметра передается целое число, 
// метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
// Замечание: ноль считаем положительным числом.
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        doVerify(num);
    }
    
    static void doVerify(int num) {
        if (num >= 0){
            System.out.println("Число " + num + " = положительное");
        }
        else if (num < 0){
            System.out.println("Число " + num + " = отрицательное");
        }
    }
}