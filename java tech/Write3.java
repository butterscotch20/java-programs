import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Write3
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 num");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is max");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is max");
        }
        else 
        {
            System.out.println("c is max");
        }

    }
}