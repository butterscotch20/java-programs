import java.util.Scanner;
class Addnum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a number");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("Addition is "+sum);

    }
}