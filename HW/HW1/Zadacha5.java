// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 5. Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = iScanner.nextLine();
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();

        Repeat(str, num);

    }

    private static void Repeat(String str, int num){ // не получилось сделать вывод строк с абзаца :(

        if(num > 0){
        String result = str.repeat(num);
        System.out.println(result + " ");
        }
        else {
            System.out.print("ОШИБКА!"); 
        }
    }
}