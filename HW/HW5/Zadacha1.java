//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022

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

public class Zadacha1 {

    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число римского формата записи: ");
        String arabNum = iScanner.next();
        System.out.println(arabNum + " --> " + romanNumToArab(arabNum));
        iScanner.close();
    }
    
    private static int letterToNumber(char letter){ // кейсы со значением литеры римская: арабская
        switch (letter) {
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default:   return -1;
        }
    }
    
    public static int romanNumToArab(String roman){ // метод конвертации римской цифры в арабскую
    
        int integerValue = 0; // целочисленное значение
        for (int i = 0; i < roman.length(); i++) {
            char convertToArab = roman.charAt(i); // будет возвращать значение символа по указанному индексу 
            int number = letterToNumber(convertToArab);
            // т.к. римские числа строятся по убыванию
            if (i + 1 < roman.length()) {
                int nextNumber = letterToNumber(roman.charAt(i + 1));
                if (nextNumber > number) { // если следующее значение больше, чем предыдущее, тогда вычитаем (например IV)
                    integerValue += (nextNumber - number);
                    i++;
                }
                else {
                integerValue += number; // иначе складываем
                }
            } 
            else {
                integerValue += number;
            }
        }
        return integerValue;
    }
    }

    // -------------------------------- решение с помощью использования HashMap ------------------------------------

//     public static void main(String[] args) {
//         System.out.println("Введите число римского формата записи: ");
//         String romanNum = iScanner.nextLine();
//         System.out.println(romanNum + " --> " + romanNumToArab(romanNum));
//         iScanner.close();
//     }
    
//     public static int romanNumToArab(String romanNum) { // метод из римского числа в арабское
        
//         Map<Character, Integer> romanMap = new HashMap<>(); // HashMap римских чисел

//         romanMap.put('I', 1);
//         romanMap.put('V', 5);
//         romanMap.put('X', 10);
//         romanMap.put('L', 50);
//         romanMap.put('C', 100);
//         romanMap.put('D', 500);
//         romanMap.put('M', 1000);

//         int transformation = 0;
//         char[] charArray = romanNum.toCharArray(); // преобразуем строку в массив

//         for(int i = 0; i < charArray.length; i++){
//             if(i == charArray.length-1){
//                 transformation = transformation + romanMap.get(charArray[i]);
//             }
//             else if(romanMap.get(charArray[i]) >= romanMap.get(charArray[i + 1])){
//                 transformation = transformation + romanMap.get(charArray[i]);
//             }
//             else{
//                 transformation = transformation + (romanMap.get(charArray[i + 1]) - romanMap.get(charArray[i]));
//             i ++;
//             }
//             }
//             return transformation;
//     }
// }