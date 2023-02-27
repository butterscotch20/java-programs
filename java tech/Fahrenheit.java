import java.util.Scanner;
class Fahrenheit
{
    public static void main(String[]args)
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temprature in f");
        f=sc.nextInt();
        c=(5.0/9.0)*(f-32);
        System.out.println(c);
    }

}

