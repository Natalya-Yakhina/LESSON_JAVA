//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


package HW.HW1;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int number = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        for(int i = 0; i < number; i++) {
            sum += i;
        }

        int mult = 1;
        for(int i = 1; i <= number; i++) {
            mult *= i; 
        }
        System.out.printf("Сумма чисел от 1 до %d -> %d", number, sum);
        System.out.println();
        System.out.printf("Произведение чисел от 1 до %d -> %d", number, mult);
    }
}
