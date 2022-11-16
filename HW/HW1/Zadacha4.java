// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 4. Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW1;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();

        System.out.print(doVerify(num));
    }

    private static boolean doVerify(int num){
        if (num > 0){
            return false;
        }
        else {
            return true;
        }
    }
}
