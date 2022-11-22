//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 1. Заполнить список 10 случайными числами. Отсортировать методом sort() и вывести на экран
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package seminar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;

// public class seminar3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<Integer>();
//         numbers.add(5);
//         numbers.add(4);
//         numbers.add(3);
//         System.out.println(numbers);

//         Collections.sort(numbers);
//         System.out.println(numbers);
//     }
// }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. С консоли вводятся 10 слов. Нужно их прочитать и вывести только уникальные
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class seminar3 {
//         public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Введите количество слов: ");
//         int len = iScanner.nextInt();
//         scanWord(len);
//         iScanner.close();
//         }
        
//         public static void scanWord(int len) {
//         Scanner iScanner = new Scanner(System.in);
//         Set<String> words = new HashSet<>();
//         for (int i = 0; i < len; i++) {
//             System.out.println("Введите слово: ");
//             words.add(iScanner.nextLine());
//         }
//         iScanner.close();
//         System.out.println("Уникальные слова: " + words.toString());
//     }
// }
//-------------------------------------------------------------
// Map<Integer, String> map = new HashMap<>(); // TreeMap
// map.put(1, "First");
// map.put(2, "Second");
// map.put(3, "Third");

// map.put(1, "Overwrite");

// System.out.println(map);

// System.out.println(map.containsKey(1));
// System.out.println(map.containsKey(5));

// System.out.println(map.get(3));
//--------------------------------------------------------------
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 3. Заполнить список строк. Вывести строки + количество их повторений.
// first second first first first third: first - 3, second - 1, third - 1
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// ----------------------------- 1 ------------------------------
// public class seminar3 {
//             public static void main(String[] args) {
//             Scanner iScanner = new Scanner(System.in);
//             System.out.println("Введите количество слов: ");
//             int len = iScanner.nextInt();
//             scanWord(len);
//             iScanner.close();
//             }
//             public static void scanWord(int len) {
//                 Scanner iScanner = new Scanner(System.in);
//                 Map<String, Integer> words = new HashMap<>();
//                 for (int i = 0; i < len; i++) {
//                     System.out.println("Введите слово: ");
//                     String word = iScanner.nextLine();
//                     if (words.containsKey(word)) { // если слово есть
//                         int count = words.get(word); // сколько раз слово встречалось
//                         words.put(word, count + 1);
//                         }
//                     else{
//                         words.put(word, 1);
//                         }
//                     }   
//             iScanner.close();
//             System.out.println("количество повторений слов: " + words.toString());
//             }
// }
// ----------------------------- 2 ------------------------------
public class seminar3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String word = sc.next();

                Integer count = map.get(word);
                count = (count != null) ? count + 1 : 1;
                // Object value = expression ? trueValue : falseValue;
                
                // if (count != null){
                //     count++;
                // }
                // else{
                //     count = 1;
                // }
                map.put(word, count);
        }
        System.out.println(map);
    }
}