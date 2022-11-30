//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
// 2. Написать метод, который переведёт данное целое число в римский формат.

// IV - 4
// VII - 7
// I = 1
// V = 5
// X = 10
// L = 50
// C = 100
// D = 500
// M = 1000
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package HW.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha {

    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число римского формата записи: ");
        String romanNum = iScanner.nextLine();
        System.out.println(romanNum + " --> " + romanNumToArab(romanNum));
        // System.out.println("Введите число арабского формата записи: ");
        // int arabNum = iScanner.nextInt();
        // System.out.println(arabNum + " --> " + arabNumToRoman(arabNum));

        iScanner.close();
    }
    
    public static int romanNumToArab(String romanNum) { // метод из римского числа в арабское
        
        Map<Character, Integer> romanMap = new HashMap<>(); // HashMap римских чисел

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int transformation = 0;
        char[] charArray = romanNum.toCharArray(); // преобразуем строку в массив

        for(int i = 0; i < charArray.length; i++){
            if(i == charArray.length-1){
                transformation = transformation + romanMap.get(charArray[i]);
            }
            else if(romanMap.get(charArray[i]) >= romanMap.get(charArray[i + 1])){
                transformation = transformation + romanMap.get(charArray[i]);
            }
            else{
                transformation = transformation + (romanMap.get(charArray[i + 1]) - romanMap.get(charArray[i]));
            i ++;
            }
            }
            return transformation;
    
}


    // public static String arabNumToRoman(int arab) { // метод из арабского числа в римское
        
    //     Map<Integer, Character> arabNum = new HashMap<>(); // HashMap арабских чисел
       
    //     arabNum.put(1000, 'M');
    //     arabNum.put(500, 'D');
    //     arabNum.put(100, 'C');
    //     arabNum.put(50, 'L');
    //     arabNum.put(10, 'X');
    //     arabNum.put(5, 'V');
    //     arabNum.put(1, 'I');

    //     StringBuilder romanNumber = new StringBuilder();
        
    //         while (arab > 0) {
    //             while (arab / 1000 >= 1) { 
    //                 romanNumber.append(arabNum.get(1000));
    //                 arab -= 1000;
    //             }
    //             while (arab / 100 >= 1) { 
    //                 if (arabNum.containsKey(arab - arab % 100)) {
    //                     romanNumber.append(arabNum.get(arab - arab % 100));
    //                     arab = arab % 100;
    //                 }
    //                 if (arab >= 500) {
    //                     romanNumber.append(arabNum.get(500));
    //                     arab = arab - 500;
    //                 }
    //                 else {
    //                     if (arab >= 100){
    //                         romanNumber.append(arabNum.get(100));
    //                         arab -=100;
    //                     }
    //                 }
    //             }
    //             while (arab / 10 >= 1) {
    //                 if (arabNum.containsKey(arab - arab % 10)) {
    //                     romanNumber.append(arabNum.get(arab - arab % 10));
    //                     arab = arab % 10;
    //                 }
    //                 if (arab >= 50) {
    //                     romanNumber.append(arabNum.get(50));
    //                     arab -=50;
    //                 }
    //                 else {
    //                     if (arab >= 10){
    //                         romanNumber.append(arabNum.get(10));
    //                         arab -=10;
    //                     }
    //                 }
    //             }
    //             while (arab> 0) {
    //                 if (arabNum.containsKey(arab)) {
    //                     romanNumber.append(arabNum.get(arab));
    //                     arab = 0;
    //                 }
    //                 if (arab >= 5) {
    //                     romanNumber.append(arabNum.get(5));
    //                     arab -=5;
    //                 }
    //                 else {
    //                     if (arab >= 1){
    //                         romanNumber.append(arabNum.get(1));
    //                         arab -=1;
    //                     }
    //                 }
    //             }
    //         }
    //         return romanNumber.toString();
    //     }   
    }