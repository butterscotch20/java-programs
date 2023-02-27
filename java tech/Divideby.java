import java.util.Scanner;
class Divideby
{
    public static void main(String[]args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("num is divisible");
        }
        else
        {
            System.out.println("num is not divisible");
        }
    }
}