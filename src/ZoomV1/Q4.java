package ZoomV1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String password = "let me in";
        System.out.println("Guss the password");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println(password.equals(guess));

        if (password.equals(guess)) {
            System.out.println("Your guess was correct!");
            return;
        } else if ("don't stop believing".equals(guess)) {
            System.out.println("You got the second password");
        } else {
            System.out.println("This is false");


        }
        System.out.println("This is always going to run!");
    }
}
