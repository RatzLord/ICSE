import java.util.*;
class spcl
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,sum=0,n,num,d,fact;
        System.out.println("Enter a no.");
        n=in.nextInt();
        num=n;
        while(n!=0)
        {
            d=n%10;
            fact=1;
            for(i=1;i<=d;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==num)
        System.out.println("special");
        else
        System.out.println("not special");
     }
}