import java.io.*;
import java.util.*;
class lab5
{
    public static void main(String[] args) {
        int n,i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = obj.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter  numbers");
            arr[i] = obj.nextInt();
        }
        System.out.println("\n Before Sorting:");
        for (i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        for (i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n After sorting:");
        for(i=0;i<n;i++)
        System.out.println(arr[i]+" ");

    }
}