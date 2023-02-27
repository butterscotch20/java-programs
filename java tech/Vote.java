import java.util.*;
class Vote
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        int age;
        System.out.println("Enter you age");
        age=Sc.nextInt();
        if(age>=18)
        {
            System.out.println("You can cast a vote");
        }
        else
        {
            System.out.println("You can not cast a vote");
        }
    }
}

