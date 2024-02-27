import java.util.Arrays;
import java.util.*;
public class Question4ii
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=  s.nextInt();
        int[] a = new int[n];

        System.out.println("reading elements into array:");
        for(int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }

        Arrays.sort(a);
        System.out.println("The elements after sorting in ascending order:");
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

}
