// ___________________________________________________________________________________________________
// n - четное
// Создать строку, которая состоит из символов c1c2c1c2c1c2...c1c2, причем длина этой строки равна n
// ___________________________________________________________________________________________________
package seminar;

import java.util.Scanner;

// public class seminar2 {
//     public static void main(String[] args) {
//         // String string = buildString('a', 'b', 8);
//         // System.out.print(string);
//         // System.out.println(buildString('a', 'b', 7));
//         System.out.println(buildString('a', 'b', 8));
//     }

//     public static String buildString(char c1, char c2, int n) {
//     if (n == 0 || n % 2 != 0) {
//     // return "";
//     // return null;
//     throw new IllegalArgumentException("Значение n " + n + " некорректное");
//     }
    
//     StringBuilder builder = new StringBuilder();
//     // String res = "";
//     for (int i = 0; i < n / 2; i++) {
//     builder.append(c1).append(c2);
//     // res += c1 + "" + c2;
//     }
    
//     return builder.toString();
//     }
// }
// ___________________________________________________________________________________________________

// aaaabbbcdd -> a4b3c1d2
// ___________________________________________________________________________________________________
// заводим счетчик
    // итерируемся по строке
    // если текущий символ совпадает с предыдущим, то увеличиваем счетчик
    // если нет, то сохранили в какую-то (результирующую) строку и обнулили счечик
    // в конце вернули результирующую строку
    
public class seminar2 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите исходную строку: ");
    String str = iScanner.nextLine();
    iScanner.close();
    String result = strCompr(str);
    System.out.println("Результат: " + result);
    }

    public static String strCompr(String str) {
        char[] chars = str.toCharArray();
        int count = 1;
        StringBuilder builder = new StringBuilder();
        builder.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
            count++;
            } 
            else {
            builder.append(count);
            count = 1;
            builder.append(chars[i]);
            }
        }
        builder.append(count);
        return builder.toString();
        }
}

    