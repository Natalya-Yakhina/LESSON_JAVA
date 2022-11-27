//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// 2. Реализовать консольное приложение, которое:
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// Если ввод не содержит символа ~, то завершает программу с ошибкой.
// Если введено -1, то выходим
//  
// [string~3]
// ghg
// print~0 => ""
// print~3 => string

package HW.HW4;

import java.util.LinkedList;
import java.util.Scanner;

public class Zadacha2 {

    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        String elem = new String();
        
        while (true) {
            System.out.print("Введите текст: ");
            elem = input.next();
            if (elem.equals("-1")) { // если ввод -1, то выход
                break;
            }

            String[] splitElem = elem.split("~");
            if (splitElem[0].equals("print")) {
                int index = Integer.parseInt(splitElem[1]);
                deleteElement(list, index);
            } 
            else {
                addElement(list, splitElem);
            }
            input.close();
            System.out.println(list);
        }
    }

    static LinkedList<String> addElement(LinkedList<String> tempList, String[] temp) {
        tempList.add(Integer.parseInt(temp[1]), temp[0]);
        return tempList;
    }
            
    static LinkedList<String> deleteElement(LinkedList<String> tempList, int i) {
        System.out.println(tempList.get(i));
        tempList.remove(i);
        return tempList;
    }
}

// ========================= ввод строки, выход, вывод ошибки ==================================

    //     LinkedList<String> list = new LinkedList<String>();
    //     Scanner iScanner = new Scanner(System.in);

    //     while(true){
    //         System.out.print("Введите строку в формате: text~num --> ");
    //         String input = iScanner.nextLine();
    //         if(input.equals("-1")){ // если ввод -1, то выход
    //             break;
    //         }
    
    //         int idx = input.lastIndexOf("~");
    //         if(input.isEmpty() || idx == -1){ 
    //             throw new RuntimeException("Ошибка ввода!"); // сгенерировать (throw new) исключение
    //         }
    
    //         // String text = new String();
    //         // String[] split_text = text.split("~");
    //         //     if (split_text[0].equals("print~num")) {
    //         //     System.out.println(list.get(idx));
    //         //     list.remove(idx);
    //         //     }