// =========================== LinkedList ===========================

// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой размер. 
// Элементы доступны для вставки или удаления в любой позиции.


// LinkedList нужен для небольшого количества элементов, в которых операции добавления\удаления 
// встречаются чаще операций чтения.

package lection;

import java.util.PriorityQueue;
import java.util.Stack;

// import java.util.LinkedList;

// public class lection4 {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<Integer>(); 
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//     }
// }

// =========================== Queue ===========================
// что пришло вперед, то и обрабатывается в первую очередь (очередь в магазине)

// Queue<Integer> queue = new LinkedList<Integer>();
// queue.add(1);
// int item = queue.remove(); // извлечение

// java.util.NoSuchElementException // извлечение элементов из очереди при условии что там элементов нет!

// -------------------------------------------------------------------------
// import java.util.*;
// public class Ex002_Queue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue); // [1, 2, 3, 4]
//        int item = queue.remove();
//        System.out.println(queue); // [2, 3, 4]
//        queue.offer(2809);
//        item = queue.remove();
//        System.out.println(queue); // [3, 4, 2809]
//        item = queue.remove();
//        System.out.println(queue); // [4, 2809]
//        item = queue.poll();
//        System.out.println(queue); // [2809]
//    }
// }
// -------------------------------------------------------------------------
// import java.util.*;
// public class Ex002_Queue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        int item = queue.remove();
//        queue.offer(2809);
//        item = queue.poll();
//        System.out.println(queue);
//    }
// }
// -------------------------------------------------------------------------
// import java.util.*;
// public class Ex002_Queue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        int item = queue.remove();
//        queue.offer(2809);
//        item = queue.poll();
//        System.out.println(queue);

//        queue.element()
//        queue.peek()
//    }
// }
// -------------------------------------------------------------------------
// import java.util.*;
// public class Ex002_Queue {
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        int item = queue.remove();
//        queue.offer(2809);
//        item = queue.poll();
//        System.out.println(queue);
//        queue.remove(2809); // зачем очередь??
//        queue.element()
//        queue.peek()
//    }
// }
// =========================== PriorityQueue ===========================
// Наивысший приоритет имеет «наименьший» элемент.

// public class lection4 {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

//         pq.add(123);
//         pq.add(456);
//         pq.add(789);
//         System.out.println(pq);
//         System.out.println(pq.poll());
//     }
// }
// =========================== Deque – double ended queue ===========================
// Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах. | url
// import java.util.*;
// public class Ex003_Deque {
//    public static void main(String[] args) {
//        Deque<Integer> deque = new ArrayDeque<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1);   deque.addLast(2);
//        deque.removeLast();  deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst();   deque.pollLast();
//        deque.getFirst();    deque.getLast();
//        deque.peekFirst();   deque.peekLast();
//    }
// }
// =========================== Stack ===========================
// Stack представляет собой обработку данных по принципу LIFO. Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.
// ранее в последнюю очередь (альтернатива - рекурсия)
// push(E item)
// pop()


// вычислить значение выражения в постфиксной форме записи
// 1+2*3    (1+2)*3
// 123*+    12+3*
// 123*+    СТЕК 
            // 3
            // 2
            // 1

public class lection4 {
    public static void main(String[] args) {
        var exp ="1 2 3 * +".split(""); //1+2* 3
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<> ();
        for (int i = 0; i < exp.length; i++) {

        if (isDigit(exp[i])) {
            st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                res = -st.pop() + st.pop();
                    case "*":
                res = st.pop() * st.pop ();
                st.push(res);
                break;
                    case "/":
                res = st.pop()/ st.pop();
                st.push (res);
                break;
                default:
                break;
            }
        }
}
        System.out.printf("%d\n", st.pop());
    }
}



