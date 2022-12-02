package seminar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class seminar6 {
//    public static void main(String[] args) {
//     long amount = 250_000;

//         // Создаете одно из множеств: HashSet, TreeSet, LinkedHashSet (<Integer>)
//         // Замеряете время заполнения каждого из них 250_000 числами
        
//         HashSet<Integer> hashSet = new HashSet<Integer>();
//         long time = System.currentTimeMillis();
//         for(int i = 0; i < amount; i++) {
//             hashSet.add(i);
//         }
//         System.out.println("hashSet - " + (System.currentTimeMillis() - time));

//         TreeSet<Integer> treeSet = new TreeSet<Integer>();
//         time = System.currentTimeMillis();
//         for(int i = 0; i < amount; i++) {
//             treeSet.add(i);
//         }
//         System.out.println("treeSet - " + (System.currentTimeMillis() - time));

//         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
//         time = System.currentTimeMillis();
//         for(int i = 0; i < amount; i++) {
//             linkedHashSet.add(i);
//         }
//         System.out.println("linkedHashSet - " + (System.currentTimeMillis() - time));
//     }

//     // чтоб загнать в метод

//     // speedMeasurement(new HashSet<>());
//     // speedMeasurement(new TreeSet<>());
//     // speedMeasurement(new LinkedHashSet<>());

//     // public static void speedMeasurement(Set<Integer> set) {
//     //     long sumTime = 0;
//     //     for (int j = 0; j < 100; j++) {
//     //     long time = System.currentTimeMillis();
//     //     for (int i = 0; i < 250_000; i++) {
//     //     set.add(i);
//     //     }
//     //     sumTime += System.currentTimeMillis() - time;
//     //     set.clear();
//     //     }
//     //     System.out.println(sumTime / 100);
//     //     }
// } 

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью (Set) Map вычислите процент
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой
// - Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве

// =============================================================================================================

// 1. Смотрим, какие в принципе значения есть в итоге в массиве
// 2. Среди тех, которые есть => Пробегаемся по ним и для каждого смотрим, сколько раз оно встречалось в массиве
// 2.1 Если встречалось больше 1 раза, выкидываем
// 3. В итоге имеет набор уникальных (тех, которые встретились только 1 раз) значений

    public static void main(String[] a) {
    // int random = ThreadLocalRandom.current().nextInt(25); // random int [0, 24]
        int[] array = new int[1000];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25); // random int [0, 25)
        }
    }
    // 1-3
    // Set<Integer> a = new TreeSet<>(); // [0, 1, 2, 3, 4, 5]
    // Iterator<Integer> iterator = a.iterator();
    // // [1, 2, 3, 4, 5]
    // // ^
    // while (iterator.hasNext()) {
    // int x = iterator.next();
    // int counter = 0;
    // // for each in array if x == a[i] counter++
    // iterator.remove();

    // 1. Создать массив размера 1000
    // 2. Заполнить массив рандомными значениями от 0 до 24 включительно
    // 3. Понять, какие значения там есть. Обозначим через A
    // 4. Для каждого из тех, которые есть есть в A, смотрим,
    // сколько раз оно встретилось в массиве
    // 5. Если оно встретилось больше 1 раза, то выкидываем его
    // ->> Теперь имеется набор из уникальных значений
    
    // 6. Вычисляем процент уникальных чисел
    Set<Integer> unique = new HashSet<>();
    int[] array = new int[1000];
    ///
    
    // 1 2 3 4 1 5 7
    f: for (int i = 0; i < array.length; i++) {
    int a = array[i];
    for (int j = i + 1; j < array.length; j++) {
    int b = array[j];
    if (a == b) {
    continue f;
    }
    }
    unique.add(a);
    }
}