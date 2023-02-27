import java.util.Scanner;
class Test2
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a/10;
        c=a%10;
        a=a+c;
        System.out.println(a);
    }
}
