import java.util.Scanner;

public class Exp3a_MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = arr[0], min = arr[0];

        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        sc.close();    
    }
}
