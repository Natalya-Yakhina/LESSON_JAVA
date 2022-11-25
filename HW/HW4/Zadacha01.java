// * 0.1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// * 0.2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.


package HW.HW4;

import java.util.LinkedList;
import java.util.Stack;

public class Zadacha01 {
    public static void main(String[] args) {

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        AddStack(array);
        AddLinkedList(array);
    }

    public static void AddStack(int[] array) { // добавить в стек
        Stack<Integer> stack = new Stack<>();
        // LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]); // push - помещает элемент в стек 
        }
            while(!stack.empty()){
                System.out.print(stack.pop() + " ");
            }
    }

    public static void AddLinkedList(int[] array) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            ll.add(array[i]);
        }
        System.out.println("\n" + ll);
    }
}