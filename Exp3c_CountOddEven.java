import java.util.Scanner;

public class Exp3c_CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int even = 0, odd = 0;

        for (int val : arr) {
            if (val % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers  = " + odd);
        sc.close();    
    }
}
