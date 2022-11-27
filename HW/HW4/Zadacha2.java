//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. Реализовать консольное приложение, которое:
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// Если ввод не содержит символа ~, то завершает программу с ошибкой.
// Если введено -1, то выходим
//  
// string~3
// java~5
// print~0 => ""
// print~3 => string

package HW.HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);

    while(true){
        System.out.print("Введите строку в формате: text~num --> ");
        String input = iScanner.nextLine();
        if(input.equals("-1")){ // если ввод -1, то выход
            break;
        }

        int idx = input.lastIndexOf("~");
        if(input.isEmpty() || idx == -1){ // если отсутствует значение ~,
            throw new RuntimeException("Ошибка ввода, нет знака'~'!"); // то сгенерировать (throw new) исключение
        }
    }

    
        
}
}
    //     public static void main(String[] args) {
            
    //         LinkedList<String> ll = new LinkedList<String>();
    //         Scanner input = new Scanner(System.in);
    //         String elem = new String();
    
    //         while (true) {
    //         System.out.print("Enter string: ");
    //         elem = input.next();
    //         if (elem.equals("stop")) {
    //         break;
    //         }
    //         String[] split_elem = elem.split("~");
    //         if (split_elem[0].equals("print")) {
    //             int index = Integer.parseInt(split_elem[1]);
    //             deleteElement(ll,index);
    
    //         }
    //         else {
    //             addElement(ll,split_elem);   
    //         }
    //         System.out.println(ll);
    //     }
    //     input.close();
    //     System.out.println(ll);
    // }
    // static LinkedList<String> addElement (LinkedList<String> temp_list, String[] temp){
    //     temp_list.add(Integer.parseInt(temp[1]), temp[0]);
    //     return temp_list;
    // }
    
    // static LinkedList<String> deleteElement (LinkedList<String> temp_list, int i){
    //     System.out.println(temp_list.get(i));
    //     temp_list.remove(i);
    //     return temp_list;
    // }
    
    // }
    //-------------------------------------------------------------
//     public static void main(String[] args) {
//         LinkedList<String> linkedList = new LinkedList<>();
//         for ( ; ; ) {
//             Scanner scanner = new Scanner(System.in);
//             String[] str = scanner.nextLine().split("~");
//             int index = Integer.parseInt(str[1]);
//             if (index > linkedList.size()) {
//                 System.out.println("Error out of bound");
//                 System.out.println("Repeat value");

//             } else {
//                 if (str[0].equalsIgnoreCase("print")) {
//                     System.out.println(linkedList.get(index));
//                     linkedList.remove(index);
//                 } else {
//                     linkedList.add(index, str[0]);
//                     System.out.println("Value add");
//                 }
//             }
//         }
//     }
// }
// -------------------------------------------------------------
// public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<>();
//     Scanner scanner = new Scanner(System.in);
//     boolean exit = false;
//     while(!exit) {
//         String[] input = scanner.nextLine().split("~");
//         String text = input[0];
//         if(text.equalsIgnoreCase("exit")) {
//             exit = true;
//             continue;
//         }
//         int num = Integer.parseInt(input[1]);
//         if(text.equalsIgnoreCase("print")) {
//             if(num<list.size()) {
//                 System.out.println(list.get(num));
//                 list.remove(num);
//             }
//             else
//                 System.out.println("Не допустимый индекс");
//             continue;
//         }
//         while((list.size()-1)<num)
//             list.add("");
//         list.set(num, text);

//         System.out.println(list);
//     }
// }
// }