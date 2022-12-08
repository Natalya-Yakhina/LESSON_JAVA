//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package exceptionJava.HW1_exceptoin;
public class Zadacha_01 {
    public static int method1(int a, int b) {
        return a / b;
        // ArithmeticException
    }

    public static int method2() {
        String str = null;
        return str.length();
        // NullPointerException
    }

    public static int[] method3(int a, int b, int c) {
        int[] array = new int[a];
        array[b] = c;
        return array;
        // ArrayIndexOutOfBoundsException
    }
    public static void main(String[] args) {
        System.out.println(metod1(1, 0));
        System.out.println(metod2());
        System.out.println(metod3(10, 20, 2));

    }
}


