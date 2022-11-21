
// -------------------------- Object ------------------------------

// - Тип данных Object – «всему голова»
// - Упаковка – любой тип можно положить в переменную типа Object
// - Распаковка – преобразование Object-переменной в нужный тип
// - Иерархия типов – любой тип «ниже» Object’а


// Тип данных
   
package lection;
// public class collection {
//     public static void main(String[] args) {
//     Object o = 1; GetType(o);    // java.lang.Integer      
//     o = 1.2; GetType(o);         // java.lang.Double
// }
// static void GetType(Object obj) {
//     System.out.println(obj.getClass().getName());
// }
// }


// public class collection {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }
//     static Object Sum(Object a, Object b) {
 
//         if (a instanceof Double && b instanceof Double) { // проверить на тип данных
//             return  (Object)((Double) a + (Double) b); // если все верно, сложить
//         } else if(a instanceof Integer && b instanceof Integer) {
//             return (Object)((Integer) a + (Integer) b);
//         } else return 0;
//     }
//  }
// // прибегать к запаковке и распаковке Object - в крайних случаях

// -------------------------- МАССИВЫ ------------------------------

// public class collection { // добавить элемент в массив
//     static int[] AddItem(int[] array, int item) { // массив, элемент
//         int length = array.length; // определим длинну
//         int[] temp = new int[length + 1];  // создадим новый массив с увеличенной длинной
//         System.arraycopy(array, 0, temp, 0, length); // копирование
//         temp[length] = item; // новый элемент добавим в хвост
//         return temp; // вернем новый массив
//     }
//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);
//         for (int j : a) { System.out.printf("%d ", j); }
//     }
//  }

// -------------------------- КОЛЛЕКЦИИ ------------------------------

// ------------------------ «Удобный массив» -------------------------

// Разные способы создания
// ArrayList list = new ArrayList();

// ---------------------- Иерархия коллекций. List -------------------

// List – пронумерованный набор элементов.
 
// Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент. 

// Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.

// URL

// ArrayList, LinkedList (Vector, Stack – устаревшие)

// ---------------------- Иерархия коллекций. ArrayList ----------------------
// «Удобный массив»
// Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>(); // <Integer> - обобщение - что конкретно лежит
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10); // хранилище под 10 элементов
// ArrayList<Integer> list4 = new ArrayList<>(list3);

import java.util.ArrayList;
import java.util.List;
// public class collection {
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
// }

// public class collection {
//     public static void main(String[] args) {
//     ArrayList <Integer> list = new ArrayList <Integer>(); 
//     list.add(2809);

//     for (Object o : list) {
//         System.out.println(o);
//         }
//     }
// }
// ---------------------- Коллекции. Row Type ----------------------

// public class collection {

//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
// } // row type java

// ---------------------- Коллекции. Save Type ----------------------

// public class collection {

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(123);
//        // list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
// }
// Коллекции. Save Type
// - Ошибки на этапе компиляции лучше ошибок времени выполнения
// - Повторное использование кода 

// ---------------------- Коллекции. Функционал ----------------------

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// import java.util.Arrays;

// public class collection {
//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year }; // формирую массив
//        List<StringBuilder> d = Arrays.asList(date); // формирую коллекцию
//        System.out.println(d); // [29, 9, 1990]
//        date[1] = new StringBuilder("09");// подменю 2 элемент
//        System.out.println(d); // [29, 09, 1990]
//    }
// }

// ---------------------- Коллекции. Функционал ----------------------

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список

// public class collection{
//    public static void main(String[] args) {
//        Character value = null;
//     //    List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
//         List<Character> list1 = new ArrayList<Character>();
//         list1.add('S');
//         list1.add('e');     
//         list1.add('r');
//         list1.add('g');

//        System.out.println(list1);
//        list1.remove(1); // удалить элемент 
//        System.out.println(list1);

//    }
// }

// ---------------------- ИТЕРАТОР ----------------------

// Получение итератора с целью более гибкой работы с данными URL

// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место Enumeration в Java Collections Framework. 
// Итераторы отличаются от перечислений двумя способами:
// Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.

// hasNext(), next(), remove()

// ListIterator<E> URL

// hasPrevious(), E previous(), nextIndex(), previousIndex

import java.util.*;
public class collection {
   public static void main(String[] args) {
       List<Integer> list = List.of(1, 12, 123, 1234, 12345);

       for (int item : list) { 
        System.out.println(item); 
       }

        Iterator<Integer> col = list.iterator();
        System.out.println();

       while (col.hasNext()) {
           System.out.println(col.next());
        //    col.next();
        //    col.remove(); 
       }
   }
}








