import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Charinput
{
    public static void main(String[]args)
    {
        char ch;
        System.out.println("Enter any char");
        Scanner sc=new Scanner(System.in);
        ch.sc.next().charAt(0);
        x=ch; //covert char into ASCII
        if(x>=65 && x<90)
        {
            System.out.println("Capital");
        }

        else if(x>97 && x<122)
        {
            System.out.println("small");
        }
        else if(a>48 && x>57)
        {
            System.out.println("digit");
        }
        else 
        {
            System.out.println("i dont this char");
        }
        
    }
}