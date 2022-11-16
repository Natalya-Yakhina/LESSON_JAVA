// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Написать метод, который определяет, является ли год високосным, 
// и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = iScanner.nextInt();
        System.out.print(resultYear(year));
    }
    private static boolean resultYear(int year) {
    if ((year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))){
        return true;
        }
        else{
            return false;
        }
    }
}