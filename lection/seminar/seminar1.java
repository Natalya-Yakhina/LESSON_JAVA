package lection.seminar;

import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("name: ");
        String name = sc.nextLine();
        System.out.printf("Привет, %s!\n", name);
        sc.close();
    }
}
