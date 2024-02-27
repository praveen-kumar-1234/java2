import java.util.*;
public class Question4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s.nextInt();
        int[] a= new int[n];
        System.out.println("enter the elements into array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("After sorting in ascending order:");
        for(int array : a)
        {
            System.out.print(array+" ");
        }
    }

}
