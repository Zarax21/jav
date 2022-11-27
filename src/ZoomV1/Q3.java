package ZoomV1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int number[], size, large;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        size = scanner.nextInt();
        number = new int[size];
        System.out.println("Enter The numbers");
        for (int i = 0; i < number.length; i++) {
            number[i] = Scanner.nextInt();

        }
        large = number[0];
        for (int i=i;i<number.length;i++)
            if(large<number[1]) {
                large=number[1];
            }
        System.out.println("Largest value is "+ large);
    }
}