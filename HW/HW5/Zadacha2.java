//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. Написать метод, который переведёт данное целое число в римский формат.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package HW.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadacha2 {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите число арабского формата записи: ");
        int arabNum = iScanner.nextInt();
        // System.out.println(arabNum + " --> " + arabNumToRoman(arabNum));

        iScanner.close();
    }

    public static String arabNumToRoman(int arab) { // метод из арабского числа в римское
        
        Map<Integer, Character> arabNum = new HashMap<>(); // HashMap арабских чисел
       
        arabNum.put(1000, 'M');
        arabNum.put(500, 'D');
        arabNum.put(100, 'C');
        arabNum.put(50, 'L');
        arabNum.put(10, 'X');
        arabNum.put(5, 'V');
        arabNum.put(1, 'I');

        StringBuilder romanNumber = new StringBuilder();

        if (arab < 0) {
            throw new IllegalArgumentException("Ошибка! Число меньше нуля!");
        }
    
        while (arab > 0) {
            while (arab / 1000 >= 1) { 
                romanNumber.append(arabNum.get(1000));
                arab -= 1000;
                }
            while (arab / 100 >= 1) { 
                if (arabNum.containsKey(arab - arab % 100)) {
                    romanNumber.append(arabNum.get(arab - arab % 100));
                    arab = arab % 100;
                    }
                if (arab >= 500) {
                    romanNumber.append(arabNum.get(500));
                    arab = arab - 500;
                    }
                else {
                    if (arab >= 100){
                        romanNumber.append(arabNum.get(100));
                        arab -=100;
                        }
                    }
            }
            while (arab / 10 >= 1) {
                if (arabNum.containsKey(arab - arab % 10)) {
                    romanNumber.append(arabNum.get(arab - arab % 10));
                    arab = arab % 10;
                    }
                if (arab >= 50) {
                    romanNumber.append(arabNum.get(50));
                    arab -=50;
                }
                else {
                    if (arab >= 10){
                        romanNumber.append(arabNum.get(10));
                        arab -=10;
                    }
                }
            }
            while (arab> 0) {
                if (arabNum.containsKey(arab)) {
                    romanNumber.append(arabNum.get(arab));
                    arab = 0;
                }
                if (arab >= 5) {
                    romanNumber.append(arabNum.get(5));
                    arab -=5;
                }
                else {
                    if (arab >= 1){
                        romanNumber.append(arabNum.get(1));
                        arab -=1;
                    }
                }
            }
        }
        return romanNumber.toString();
    }
}
