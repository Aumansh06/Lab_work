package EXP1;
import java.util.Scanner;

public class Exp1e_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int rev = 0, temp = num;

        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("Reversed number = " + rev);
        sc.close();
    }
}
