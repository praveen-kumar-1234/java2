import java.util.*;
public class Question6
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        try (s)
        {
            System.out.println("Enter first number: ");
            int a = s.nextInt();
            System.out.println("Enter second number:");
            int b = s.nextInt();
            int res = a / b;
            System.out.println("division of two numbers :" + res);
        }
        catch (ArithmeticException e)
        {

            System.out.println("Arithmetic Exception occurred....");
        }
    }



}
