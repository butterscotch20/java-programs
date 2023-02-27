import java.util.*;
class Max2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,Max;
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        Max=a>b?a:b;
        if(a>b)
        {
            Max=a;
        }
        else
        {
            Max=b;
        }
        System.out.println("Max number is "+Max);

    }
}
