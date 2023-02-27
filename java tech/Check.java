import java.util.Scanner;
class Check
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter num");
        num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Possitive");
        }
        else if(num<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
    

