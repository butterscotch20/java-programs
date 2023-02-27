import java.util.Scanner;
class Digit3
{
    public static void main(String[]args)
    {
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice(+,-,*,/): ");
        choice=sc.nextInt();
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        switch(choice)
        {
            case"+":
            c=a+b;
            System.out.println("Addiction is "+c);
            break;
            case"-":
            c=a-b;
            System.out.println("substraction is "+c);
            break;
            case"*":
            e=a*b;
            System.out.println("Multiplication is "+c);
            break;
            case"/":
            c=a/b;
            System.out.println("Divison is"+c);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}