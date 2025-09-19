import java.util.*;

public class Exp3f_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int val : arr) set.add(val);

        System.out.println("Array without duplicates: " + set);
        sc.close();    
    }
}
