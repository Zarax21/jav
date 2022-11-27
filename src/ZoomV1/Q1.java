package ZoomV1;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = s1.nextInt();
    int factorial = 1;
    for(int i=1; i<=num;i++) {
        factorial = factorial*i ;
    }
    System.out.println("Factorial is :"+ factorial);
}
}

