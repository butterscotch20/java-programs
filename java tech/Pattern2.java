import java.util.Scanner;
class Pattern2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1; i<=4; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}