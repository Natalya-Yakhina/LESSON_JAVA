//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW2;

import java.util.Scanner;

public class Zadacha {
    public static void main(String[] args) {
    // -------------- 1 -------------------
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите значения строки: ");
        String sourse = iScanner.nextLine();
        System.out.println(isPalindrome(sourse));
        // System.out.println(isPalindrome("0156510"));
    }
    private static boolean isPalindrome(String sourse){

        return sourse.equalsIgnoreCase(new StringBuffer(sourse).reverse().toString());  // new StringBuffer(sourse).reverse().toString()- формирует инвертированную строку, 
                                                                                        // с помощью метода equalsIgnoreCase - сверяет её с изначальной строкой.
    }
}
    // -------------- 2 -------------------
//     private static boolean isPalindrome(String sourse){
//         int length = sourse.length();
//         for (int i = 0; i < (length / 2); i++) {                                           // cравниваем символы попарно
//             if (sourse.charAt(i) != sourse.charAt(length - i - 1)) {                       // если несоответствие - слово не палиндром
//                 return false;
//             }
//         }
//         return true;
//     }
// }