//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

package seminar;

// import java.util.Scanner;

// public class seminar1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); // Scanner - считывает данные 
//         System.out.printf("name: "); 
//         String name = sc.nextLine();
//         System.out.printf("Привет, %s!\n", name);
//         sc.close();
//     }
// }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class seminar1 {
//     public static void main (String[] args) {
//         int[] array = { 1, 1, 0, 0, 1, 1, 1 }; // массив
//         int result = method(array); // записать в результат метод
//         System.out.print(result); // вывести
//     }

//     private static int method(int[]array) {
//             int counter = 0; // счетчик
//             int bestCounter = 0; // лучший результат 
//             for (int i = 0; i < array.length; i++) {
//                 if(array[i] == 1){
//                     counter++;
//                 } else {
//                     if(counter > bestCounter){
//                         bestCounter = counter;
//                     }
//                 counter = 0;
//                 }
//             } 
//             return bestCounter;      
//     }
// }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class seminar1 {

//     public static void main(String[] args) {
//         reverseAndPrint("Добро пожаловать на курс по Java");
//         reverseAndPrint("I am like Java programs");
//     }
    
//     private static void reverseAndPrint(String str) {
//         String[] words = str.split(" "); // 6
//         for (int i = words.length - 1; i >= 0; i--) {
//         System.out.print(words[i] + " ");
//         }
//     }
// }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Задан массив, например, nums = [1,7,3,6,5,6].
// Написать программу, которая найдет индекс i для этого массива такой, 
// что сумма элементов с индексами < i равна сумме элементов с индексами > i.
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// public class seminar1 {
//     public static void main(String[] args) {

//     int[] numbers = {1, 7, 3, 6, 5, 6};
//     int median = findMedian(numbers);
//     System.out.println(median);

//     }
    
//     private static int findMedian(int[] numbers) {
//         // [a1, a2, a3, a4, a5, a6, a7]
//     // Найти такой index, что сумма слева и справа равны
//     int left = 0; // значение слева = 0
//         for(int i = 1; i < numbers.length; i++) {
//             left += numbers[i-1];

//         int rigth = 0; // значение справа, каждый раз плюсует 
//          // i + 1, i + 2, ... number.length - 1
//         for (int j = i+1; j < numbers.length; j++) {
//          rigth +=  numbers[j];
//         }

//         if (left == rigth){
//             return i;
//         }
//     }
//     return -1;
//     }
// }