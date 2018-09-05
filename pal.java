import java.util.*;
class pal
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,m,rem,rev;
        System.out.println("Enter value of m");
        m=in.nextInt();
        System.out.println("Enter value of n");
        n=in.nextInt();
        for(i=m;i<=n;i++)
        {
            rev=0;
            for(j=i;j>0;j/=10)
            {
                rem=j%10;
                rev=(rev*10)+rem;
            }
            if(rev==i)
            System.out.println(i);
        }
    }
}