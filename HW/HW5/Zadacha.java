//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022
// Написать метод, который переведёт данное целое число в римский формат.
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
        System.out.println("Введите число римского формата: ");
        // String romanNum = iScanner.nextLine();
        // System.out.println(romanNum + " --> " + romanNumToArab(romanNum));

        int arabNum = iScanner.nextInt();
        System.out.println(arabNum + " --> " + arabNumToRoman(arabNum));

        iScanner.close();
    }
    
    // public static int romanNumToArab(String romanNum) {
        
    //     Map<Character, Integer> romanMap = new HashMap<>(); // HashMap римских чисел
    //     // romanMap.put('IV', 4);
    //     // romanMap.put('VII', 7);
    //     romanMap.put('I', 1);
    //     romanMap.put('V', 5);
    //     romanMap.put('X', 10);
    //     romanMap.put('L', 50);
    //     romanMap.put('C', 100);
    //     romanMap.put('D', 500);
    //     romanMap.put('M', 1000);

    //     int transformation = 0;
    //     char[] charArray = romanNum.toCharArray();

    //     for(int i = 0; i < charArray.length; i++){
    //         if(i == charArray.length-1){
    //             transformation = transformation + romanMap.get(charArray[i]);
    //         }
    //         else if(romanMap.get(charArray[i]) >= romanMap.get(charArray[i + 1])){
    //             transformation = transformation + romanMap.get(charArray[i]);
    //         }
    //         else{
    //             transformation = transformation + (romanMap.get(charArray[i + 1]) - romanMap.get(charArray[i]));
    //         i ++;
    //         }
    //         }
    //         return transformation;
    // }

    public static String arabNumToRoman(int arabic) {
        
        Map<Integer, String> arabNum = new HashMap<>(); // HashMap арабских чисел
       
        arabNum.put(1000, 'I');
        arabNum.put(500, 'D');
        arabNum.put(100, 'C');
        arabNum.put(50, 'L');
        arabNum.put(10, 'X');
        arabNum.put(5, 'V');
        arabNum.put(1, 'I');

        arabNum.put( 900, "CM");
        arabNum.put( 400, "CD");
        arabNum.put(90, "XC");
        arabNum.put( 40,"XL");
        arabNum.put( 9,"IX");
        arabNum.put( 4,"IV");

        StringBuilder romanNumber = new StringBuilder();
            while (arabic > 0) {
                while (arabic / 1000 >= 1) {
                    romanNumber.append(arabNum.get(1000));
                    arabic -= 1000;
                }
                while (arabic / 100 >= 1) {
                    if (arabNum.containsKey(arabic - arabic % 100)) {
                        romanNumber.append(arabNum.get(arabic - arabic % 100));
                        arabic = arabic % 100;
                    }
                    if (arabic >= 500) {
                        romanNumber.append(arabNum.get(500));
                        arabic = arabic - 500;
                    }
                    else {
                        if (arabic >= 100){
                            romanNumber.append(arabNum.get(100));
                            arabic -=100;
                        }
                    }
                }
                while (arabic / 10 >= 1) {
                    if (arabNum.containsKey(arabic - arabic % 10)) {
                        romanNumber.append(arabNum.get(arabic - arabic % 10));
                        arabic = arabic % 10;
                    }
                    if (arabic >= 50) {
                        romanNumber.append(arabNum.get(50));
                        arabic -=50;
                    }
                    else {
                        if (arabic >= 10){
                            romanNumber.append(arabNum.get(10));
                            arabic -=10;
                        }
                    }
                }
                while (arabic> 0) {
                    if (arabNum.containsKey(arabic)) {
                        romanNumber.append(arabNum.get(arabic));
                        arabic = 0;
                    }
                    if (arabic >= 5) {
                        romanNumber.append(arabNum.get(5));
                        arabic -=5;
                    }
                    else {
                        if (arabic >= 1){
                            romanNumber.append(arabNum.get(1));
                            arabic -=1;
                        }
                    }
                }
            }
            return romanNumber.toString();
        }   
    }