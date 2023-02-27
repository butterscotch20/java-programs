import java.util.*;

public class Max
{
    public static void main(String[]args)
    {
        Scanner Sc= new Scanner(System.in);
        
            int a,b ,Max;
            System.out.println("Enter two numbers");
            a=Sc.nextInt();
            b=Sc.nextInt();
            if (a>b)
            {
                System.out.println("a is a Max");
            }
            else 
            {
                System.out.println("b is a Max");
            }
        }

    }

