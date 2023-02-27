
import java.util.*;
public class Oddeven
{
    public static void main(String[]args)
    {
        Scanner Sc= new Scanner (System.in);
        int num;
        System.out.println("Enter a number");
        num=Sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
