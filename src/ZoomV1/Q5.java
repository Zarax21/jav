package ZoomV1;

public class Q5 {
    public static void main(String[] args) {
        char ch= 'Z';

        switch (ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + "is Vowel");
                break;
            default:
                System.out.println(ch + " is Consonant");
        }
    }
}
