package EXP2;
import java.util.Scanner;

public class Exp2b_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel.");
        else
            System.out.println(ch + " is a consonant.");
        sc.close();        
    }
}
