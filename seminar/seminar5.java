    /**
    *Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
    * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
    * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
    * буква может не меняться, а остаться такой же. (Например, note - code)
    * Пример 1:
    * Input: s = "foo", t = "bar"
    * Output: false
    * Пример 2:
    * Input: s = "paper", t = "title"
    * Output: true
    */

package seminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

// public class seminar5 {

//     static Scanner sc = new Scanner(System.in, "ibm866");
//     public static void main(String[] args) {
//         System.out.println("Введите первое слово: ");
//         // TODO: 28.11.2022 Прочитать 2 слова, передать их в метод intersect
//         // Получить результат и распечатать
//         String input1 = sc.nextLine();
//         System.out.println("Введите второе слово: ");
//         String input2 = sc.nextLine();
        
//         // izomorfism(input1, input2);
//         boolean ans = izomorfism(input1, input2);
//         System.out.println("Результат: " + ans);
//         sc.close();
//         }
        
//         private static boolean izomorfism(String first, String second) {
//             Map<Character, Character> words = new HashMap<>();
//             if(first.length() == second.length()){
//                 for(int i = 0; i < first.length(); i++){
//                     if(words.containsKey(first.charAt(i))){
//                         if(words.get(first.charAt(i)) != second.charAt(i));{
//                             return false;
//                         }
//                     } else {
//                         words.put(first.charAt(i), second.charAt(i));
//                     }
//                 return true;
//                 }
//             }
//             return false;
//         }
// }

/**
* Написать программу, определяющую правильность расстановки скобок в выражении.
* () - true
* [() - false
* [()] - true
* {}[]{()} - true
* <{}{()}> - true
* {]}{()} - false
*
* Пример 1: a+(d*3) - истина
* Пример 2: [a+(1*3) - ложь
* Пример 3: [6+(3*3)] - истина
* Пример 4: {a}[+]{(d*3)} - истина
* Пример 5: <{a}+{(d*3)}> - истина
* Пример 6: {a+]}{(d*3)} - ложь
*/

// public class seminar5 {

//         static Scanner sc = new Scanner(System.in);
//         public static void main(String[] args) {
//             System.out.println("Введите значение: ");
//             String inp1 = sc.nextLine();
//             System.out.println(isomorph(inp1));
    
//             sc.close();
//         }
//         public static boolean isomorph(String str1) {
//             Stack<Character>stack=new Stack<>();
//             for (int i = 0; i < str1.length(); i++) {
//                 if (str1.charAt(i) == '{' || str1.charAt(i) =='[' ||str1.charAt(i) == '<' ||str1.charAt(i) == '(') {
//                 stack.add(str1.charAt(i));
//             }
//             if (str1.charAt(i) == '}'){
//                 Character abc = stack.pop();
//                 if(abc != '{'){
//                     break;
//                 }
//             }
//             if(str1.charAt(i) ==']'){
//                 Character abc = stack.pop();
//                 if(abc != '['){
//                     break;
//                 }
//             }
//             if(str1.charAt(i) == '>'){
//                 Character abc = stack.pop();
//                 if(abc != '<'){
//                     break;
//                 }
//             }
//             if(str1.charAt(i) == ')') {
//                 Character abc = stack.pop();
//                 if(abc != '('){
//                     break;
//                 }
//             }
//         }
//             if (stack.isEmpty()){
//                 return stack.isEmpty();
//             }
//                 return false;
//         }
// }

// Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.

// public class seminar5 {
// public static void main(String[] args) {
//     String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
//     TreeMap <Integer, List<String>> map = new TreeMap<>();
//     String[] tabl = str.split(" ");
    
//     for(int i = 0; i < tabl.length; i++){
//     int len = tabl[i].length();
//     if(map.containsKey(len)){
//     List<String> list = map.get(len);
//     list.add(tabl[i]);
//     map.put(len,list);
//     }
//     else{
//     List<String> list = new ArrayList<>();
//     list.add(tabl[i]);
//     map.put(len,list);
//     }
//     }
//     List<String> result = new ArrayList<>();
//     Set<Integer> set = map.keySet();
//     for(Integer x: set){
//     List<String> list = map.get(x);
    
//     result.addAll(list);
//     }
    
//     System.out.println(result);
//     }
// }

// Компаратор - это такая обстракция, которая позволяет установить отношения между двумя объектами

List<String> string = new ArrayList<>(List.of("fdgfg", "ff", "gg", "fgfg", "fffggg", "ttu", "uyt"));
// Цель задать отношения порядка по длине

System.out.println(string);
string.sort((str1, str2)) -> {
    if(str1.length() < str2.length()){
        return -1;
    }

    if(str1.length() == str2.length()){
        return str1.compareTo(str2);
    }
        return 1;
    };
    Collections.sort(string);
    String.out.println(string);

    private static boolean intersect(String first, String second) {
        return false;
    }
