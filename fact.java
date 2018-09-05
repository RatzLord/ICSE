import java.util.*;
class fact
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,fact=1;
        System.out.println("Enter value of n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+"="+fact);
    }
}//wap to input n numbers and find the product of all spl nos.