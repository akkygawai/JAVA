import java.util.Scanner;
public class SORTING { public static void main(String[] args) {
        int n, i;
        Scanner obj = new Scanner(System.in);
        System.out.println("HOW MANY NUMBER TO READ ?");
        n = obj.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("ENTER ANY NUMBER : ");
            arr[i] = obj.nextInt(); }
        System.out.println("BEFORE SORTING : ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " "); }
        for (i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } } } System.out.println("AFTER SORTING : ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");  } } }
    

