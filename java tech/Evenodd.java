import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Evenodd
{
    public static void main(String[]args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr num");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("even");
        }
        else 
        {
            System.out.println("odd");
        }
    
    }
 }