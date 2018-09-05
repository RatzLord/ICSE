import java.util.*;
class divisible
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=in.nextInt();
        if(n%2==0 && n%5==0)
        {
            System.out.println("Divisible by both 2 and 5");
        }
        else if(n%2==0)
        {
            System.out.println("Divisible by 2");
        }
        else if(n%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.println("Not divisible by both 2 and 5");
        }
    }
}