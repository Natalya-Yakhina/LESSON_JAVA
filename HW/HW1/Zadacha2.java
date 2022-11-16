//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) { 
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        
        System.out.println(resultSum(a,b));
    }

    private static boolean resultSum(int a, int b) {
                int sum = a + b;
                if(sum >= 10 && sum <= 20){
                    return true;
                }
                else{
                    return false;
                } 
            }
}
