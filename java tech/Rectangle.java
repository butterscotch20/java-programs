import java.util.Scanner;
class Rectangle
{
    public static void main(String[]args)
    {
        int a,p,l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        l=sc.nextInt();
        System.out.println("Enter breadth");
        b=sc.nextInt();
        a=l*b;
        System.out.println("area is "+a);
        p=2*(l*b);
        System.out.println("perimeter is "+p);

    }
}
