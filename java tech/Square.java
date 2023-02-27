import java.util.Scanner;
class Square
{
    public static void main(String[]args)
    {
        int num,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        s=num*num;
        System.out.println("Square is "+s);
    }
}
