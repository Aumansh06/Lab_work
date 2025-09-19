import java.util.Scanner;

public class Exp1b_MinutesConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        int days = minutes / (60 * 24);
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;

        System.out.println("\n" + minutes + " minutes = " + years + " years, " + months + " months, and " + days + " days.");
        sc.close();    
    }
}
