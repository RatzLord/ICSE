import java.util.*;
class jump
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter a no.");
            n=in.nextInt();
            if(n==0)
            break;
            if(n%2==0)
            System.out.println("Even");
            else
            System.out.println("Odd");
        }
    }
}