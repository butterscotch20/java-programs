import java.util.Scanner;
class Circle
{
    public static void main(String[]args)
    {
        Double a,b,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.println("Area is "+a);
        b=2*3.14*r;
        System.out.println("Area is "+b);
    }
}
