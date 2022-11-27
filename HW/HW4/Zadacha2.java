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
            if(input.isEmpty() || idx == -1){ 
                throw new RuntimeException("Ошибка ввода!"); // сгенерировать (throw new) исключение
            }
    
            // String text = new String();
            // String[] split_text = text.split("~");
            //     if (split_text[0].equals("print~num")) {
            //     System.out.println(list.get(idx));
            //     list.remove(idx);
            //     }
    
            String text = input.substring(0, idx);
            String numText = input.substring(idx+1);
            int num;
    
            if(numText.isEmpty()){
                System.out.println("Не введен номер позиции");
                continue;
            }
            
            try {
                num = Integer.parseInt(numText);
            } catch (NumberFormatException e) {
            // TODO: handle exception
                System.out.println("Номер позиции не определен");
                continue;
            }

            if(num < 0){
                System.out.println("Номер позиции < 0!");
                continue;
            }

            if(text.equals("print")){
                if(num < list.size()){
                    String textForPrint = list.get(num);
                    System.out.println("-->" + (textForPrint == null ? "\"\"" : textForPrint));
                    list.set(num, null);            
                }
                else {
                    System.out.println("-->" + "\"\"");
                }
            }
            else{
                for (int i = 0; i <num; i++){
                    if(i>=list.size()){
                        list.addLast(null);
                    }
                }
            }
            list.set(num, numText);
        }
            iScanner.close();
        }
    }
    
// ===========================================================
//         String elem = new String();
//         while (true) {
//             System.out.print("Введите строку: ");
//             elem = input.next();
//             if (elem.equals("-1")) {
//             break;
//             }

//         String[] split_elem = elem.split("~");
//         if(split_elem[0].equals("print")) {
//             int index = Integer.parseInt(split_elem[1]);
//             deleteElement(ll,index);
//         }
//         else {
//             addElement(ll,split_elem);   
//         }
//             System.out.println(ll);
//         }
//             input.close();
//             System.out.println(ll);
//         }

//         static LinkedList<String> addElement (LinkedList<String> temp_list, String[] temp){
//                 temp_list.add(Integer.parseInt(temp[1]), temp[0]);
//                 return temp_list;
//         }
                
//         static LinkedList<String> deleteElement (LinkedList<String> temp_list, int i){
//                 System.out.println(temp_list.get(i));
//                 temp_list.remove(i);
//                 return temp_list;
//                 }
// }
        //=========================
    
