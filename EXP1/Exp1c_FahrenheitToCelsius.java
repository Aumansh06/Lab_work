package EXP1;
import java.util.Scanner;

public class Exp1c_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9.0;

        System.out.println("Temperature in Celsius = " + c);
        sc.close();    
    }
}
