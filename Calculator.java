import java.util.*;
public class Calculator
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void sub(int a ,int b)
    {
        System.out.println(a-b);
    }
    public void mul(int a,int b)
    {
        System.out.println(a * b);
    }
    public void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public void add(int a,double b)
    {
        System.out.println(a+b);
    }
    public void sub(int a ,double b)
    {
        System.out.println(a-b);
    }
    public void mul(int a,double b)
    {
        System.out.println(a * b);
    }
    public void div(int a,double b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=s.nextInt();
        System.out.println("Enter the second number");
        int b=s.nextInt();
        System.out.println("Enter the third number");
        double c=s.nextDouble();
        Calculator calculator=new Calculator();
        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.mul(a,b);
        calculator.div(a,b);
        System.out.println("Now we are printing output from overloaded methods:int,double");
        calculator.add(a,c);
        calculator.sub(a,c);
        calculator.mul(a,c);
        calculator.div(a,c);
    }

}
