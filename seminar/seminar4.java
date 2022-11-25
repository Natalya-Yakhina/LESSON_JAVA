package seminar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class seminar4 {
// public static void main(String[] args) {
    //-------------------------------------------------------------
    // List<String> arrayList = new ArrayList<String>(); // хранит данные в виде массива
    // List<String> linkedList = new LinkedList<String>(); // хранит данные как последовательность, где каждый элемент хранит в сбе ссылку на след. и предыдущ. элемент
    // // измерить время работы 
    // long currentTimeMillis = System.currentTimeMillis(); // время в милисекундах, прошедшее с 01.01.1970
    // какая-то работа (добавляем 100_000 элементов в список)
    // получаем время
    // вычисляем разницу

    // List<Integer> list1 = new ArrayList<>();

    // long time = System.currentTimeMillis();
    // for (int i = 0; i < 100_000; i++) {
    //     list1.add(0, i);
    // }
    //     System.out.println(System.currentTimeMillis() - time);

    // List<Integer> list2 = new LinkedList<>();

    // time = System.currentTimeMillis();
    // for (int i = 0; i < 100_000; i++) {
    //     list2.add(0, i);
    // }
    //     System.out.println(System.currentTimeMillis() - time);
    // }
    //-------------------------------------------------------------
//     Set<Integer> set1 = new HashSet<>();
//     long time = System.currentTimeMillis();
//         for (int i = 0; i < 100_000; i++) {
//             set1.add(i);
//         }
//             System.out.println(System.currentTimeMillis() - time);

//     Set<Integer> set2 = new HashSet<>();
//     time = System.currentTimeMillis();
//         for (int i = 0; i < 100_000; i++) {
//             set2.add(i);
//         }
//             System.out.println(System.currentTimeMillis() - time);
//     }
// }
//-------------------------------------------------------------
// * Реализовать консольное приложение, которое:
// * Принимает от пользователя и “запоминает” строки.
// * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// * Если введено revert, удаляет предыдущую введенную строку из памяти.
// */

// >>hello
// >>world,
// >>java
// >>print
// <<[print, java, world,, hello]
// >>revert
// <<print
// >>print
// <<[java, world,, hello]
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String word = "";
        while (!Objects.equals(word, "end")) {
        word = scanner.nextLine();
        if (Objects.equals(word, "print")) {
        System.out.println(list);
        } else if (Objects.equals(word, "revert")) {
        if (list.size() != 0) {
        list.remove(0);
        }
        }
        list.add(0, word);
        }
    }
}

/**
* 0.1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
* 0.2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
* 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
* 2 Реализовать консольное приложение, которое:
* Принимает от пользователя строку вида
* text~num
* Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
* Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
* Если ввод не содержит символа ~, то завершает программу с ошибкой.
* Если введено -1, то выходим
*
* string~3
* java~5
* print~0 => ""
* print~3 => string
*
*/