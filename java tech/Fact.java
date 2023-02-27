import java.util.Scanner;
class Fact
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=1;
        System.out.println("Enter a number");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            sum=sum*i;
            i=i+1;
            {
                System.out.println("Fact is "+sum);
            }
        }
    }
}